package com.freshcells.domain.giata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GeoData {

    private Long GiataID;
    private Double Latitude;
    private Double Longitude;
    private Integer Accuracy;

    public Long getGiataID() {
        return GiataID;
    }

}
