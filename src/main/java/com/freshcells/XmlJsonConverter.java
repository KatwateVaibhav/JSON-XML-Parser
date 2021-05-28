package com.freshcells;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.logging.Logger;

import com.freshcells.domain.coah.Content;
import com.freshcells.domain.coah.Hotel;
import com.freshcells.domain.giata.Giata;
import com.freshcells.util.file.FileType;
import com.freshcells.util.file.FileUtil;

/**
 *
 * This class converts and integreates json&xml files into one JSON file, and
 * will download the images via URLs which have been put inside the files.
 *
 * Coah and Giata are two type of data to be read from files and write them back
 * as one integrated json file
 *
 * @author Vaibhav
 */
public class XmlJsonConverter {

	public static final String BASE_PATH;
	private static final Logger logger = Logger.getLogger(XmlJsonConverter.class.getName());

	// The path will be a "data" folder beside the project.
	static {
		URI uri = null;

		try {
			uri = XmlJsonConverter.class.getProtectionDomain().getCodeSource().getLocation().toURI();

		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		String path = Paths.get(uri).toString();
		if (path.endsWith("/")) {
			path = path.substring(0, path.length() - 1);
		}
		path = path.substring(0, path.lastIndexOf("\\"));
		path = path.substring(0, path.lastIndexOf("\\"));

		BASE_PATH = path.concat("\\data\\");
	}

	public static void main(String[] args) {
		logger.info("Please wait we are in process of reading files.");
		long startTime = System.currentTimeMillis();
		convert();
		long endtime = System.currentTimeMillis();
		logger.info("Done in " + (endtime - startTime) + " ms");
	}

	/**
	 * reads data from 6 files of XML and JSON which should be exist in the folder
	 * 'data', then integrates them as one JSON file with the name 'output.json'
	 * 
	 * @throws IOException
	 */
	public static void convert() {
		Content content = FileUtil.readXmlOrJsonFile(Content.class, "3956-coah.xml", FileType.XML);
		Giata giata = FileUtil.readXmlOrJsonFile(Giata.class, "3956-giata.xml", FileType.XML);
		content.getHotels().get(0).setGiata(giata.getGiataData());

		Content content2 = FileUtil.readXmlOrJsonFile(Content.class, "162838-coah.xml", FileType.XML);
		Giata giata2 = FileUtil.readXmlOrJsonFile(Giata.class, "162838-giata.xml", FileType.XML);
		content2.getHotels().get(0).setGiata(giata2.getGiataData());

		Content content3 = FileUtil.readXmlOrJsonFile(Content.class, "594608-coah.json", FileType.JSON);
		Giata giata3 = FileUtil.readXmlOrJsonFile(Giata.class, "411144-giata.xml", FileType.XML);

		content.getHotels().add(content2.getHotels().get(0));
		content.getHotels().add(content3.getHotels().get(0));

		Hotel hotel = new Hotel();
		hotel.setGiata(giata3.getGiataData());
		content.getHotels().add(hotel);

		uploadContentImages(content);
		FileUtil.writeObjectToJsonFile(Content.class, content, "output.json");
	}

	/**
	 * downloads images of content asynchronously, using Java 8 parallel streams
	 *
	 * @param content the object which contains data along with image URLs
	 */
	private static void uploadContentImages(Content content) {
		content.getHotels().forEach(hotel -> {
			if (hotel.getImages() != null) {
				hotel.getImages().parallelStream().forEach(image -> {
					FileUtil.downloadImage(image.getUrl(),
							image.getUrl().substring(image.getUrl().lastIndexOf("=") + 1, image.getUrl().length() - 1),
							hotel.getGiata_id().toString().concat("-coah"));
				});
			}
			if (hotel.getGiata() != null && hotel.getGiata().getBildfiles() != null) {
				hotel.getGiata().getBildfiles().parallelStream().forEach(image -> {
					FileUtil.downloadImage(image.getUrl(), image.getId(),
							hotel.getGiata().getGeoData().getGiataID().toString().concat("-giata"));
				});
			}
		});
	}
}
