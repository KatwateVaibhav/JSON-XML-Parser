package com.freshcells.domain.giata;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GiataData {

    private String PDFfile;
    private String Hotelname;
    private String Hotelkategorie;
    private String Stadtname;
    private String Zielgebietsname;
    private String Stadtnummer;
    private String Zielgebietsnummer;
    private String Landname;
    private String Landcode;
    private String Veranstaltercode;
    private String datestart;
    private String dateend;
    private GeoData GeoData;
    private String Objectcode;
    private GiataText Text;
    private String Landkarte;
    private Climate climate;
    private Long KatalogID;
    private Integer Katalogseite;
    private Integer Preisseite;
    private String Katalogname;
    private String Veranstaltername;
    private Integer VeranstalterID;
    private Long KataloghotelID;
    private String KatalogSaisonTyp;
    @XmlElement(name = "Bildfile")
    private List<Bildfile> bildfiles;
    private String Textfile;
    private String Klimagrafik;
    private String AGB;
    private String TDS;

    public Climate getClimate() {
        return climate;
    }

    public List<Bildfile> getBildfiles() {
        return bildfiles;
    }

    public String getLandcode() {
        return Landcode;
    }

    public GeoData getGeoData() {
        return GeoData;
    }

}
