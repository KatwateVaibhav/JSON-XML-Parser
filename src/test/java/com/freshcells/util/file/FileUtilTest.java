package com.freshcells.util.file;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.freshcells.domain.coah.Content;
import com.freshcells.domain.giata.Giata;

/**
 * Tests naming convention: UnitOfWork_StateOfBehaviour_ExpectedResult
 *
 * @author Vaibhav
 */
public class FileUtilTest {

    @Test
    public void readXmlOrJsonFile_simpleXML_hasResult() {
        //arrange
        String sampleFilePath = "sample.xml";
        Long expectedGiata_id = 162838L;
        //act
        Content content = FileUtil.readXmlOrJsonFile(Content.class, sampleFilePath, FileType.XML);

        //asserts
        assertNotNull(content);
        assertNotNull(content.getHotels().get(0));
        assertEquals(expectedGiata_id, content.getHotels().get(0).getGiata_id());
    }

    @Test
    public void readXmlOrJsonFile_jsonFile_readAndWriteSucceed() {
        //arrange
        String path = "594608-coah.json";

        //act
        Content content = FileUtil.readXmlOrJsonFile(Content.class, path, FileType.JSON);
        FileUtil.writeObjectToJsonFile(Content.class, content, "output-test.json");
    }

    @Test
    public void readXmlOrJsonFile_3956coahXML_hasResult() {
        //arrange
        String coahFilePath = "3956-coah.xml";
        Long expectedGiata_id = 3956L;
        String expectedCity = "Midoun";
        int expectedFormattedAddressSize = 4;
        String expectedTextTourOperator = "TCHR";
        String expectedUspsHotelAttributeRating = "4.84348";
        Integer expectedImagePriority = 2;
        String expectedVideoUrlType = "video/ogg";
        String expectedAttributeCategoryName = "distances";
        Float expectedSportRatingFriendsRating = 4.16F;

        //act
        Content content = FileUtil.readXmlOrJsonFile(Content.class, coahFilePath, FileType.XML);
        FileUtil.writeObjectToJsonFile(Content.class, content, "output-test.json");

        //asserts
        assertNotNull(content);
        assertNotNull(content.getHotels().get(0));
        assertEquals(expectedGiata_id, content.getHotels().get(0).getGiata_id());
        assertEquals(expectedCity, content.getHotels().get(0).getAddress().getCity());
        assertEquals(expectedFormattedAddressSize, content.getHotels().get(0).getAddress().getLines().size());
        assertEquals(expectedTextTourOperator, content.getHotels().get(0).getTexts().get(0).getTourOperator());
        assertNotNull(expectedTextTourOperator, content.getHotels().get(0).getTexts().get(0).getCopyrightText());
        assertNotEquals(0, content.getHotels().get(0).getTexts().get(0).getParagraphs().size());
        assertEquals(expectedUspsHotelAttributeRating, content.getHotels().get(0).getUsps().getHotelAttributeList().getAttributes().get(0).getRating());
        assertEquals(expectedImagePriority, content.getHotels().get(0).getImages().get(1).getPriority());
        assertEquals(expectedVideoUrlType, content.getHotels().get(0).getVideos().get(0).getUrls().get(2).getType());
        assertEquals(expectedAttributeCategoryName, content.getHotels().get(0).getAttributes().getCategories().get(3).getName());
        assertEquals(expectedSportRatingFriendsRating, content.getHotels().get(0).getRatings().getDetailedRating().getSportRating().getFriends());
    }

    @Test
    public void readXmlOrJsonFile_3956giataXML_hasResult() {
        //arrange
        String path = "3956-giata.xml";
        Long expectedGiata_id = 3956L;

        //act
        Giata giata = FileUtil.readXmlOrJsonFile(Giata.class, path, FileType.XML);

        //asserts
        assertNotNull(giata);
        assertNotNull(giata.getGiataData().getClimate());
        assertNotNull(giata.getGiataData().getGeoData());
        assertEquals(expectedGiata_id, giata.getGiataData().getGeoData().getGiataID());
    }

}
