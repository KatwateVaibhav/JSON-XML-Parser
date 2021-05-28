package com.freshcells.domain.coah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class HotelAttribute {

    @XmlAttribute
    private String priority;
    @XmlAttribute
    private String rating;
    @XmlValue
    private String value;

    public String getRating() {
        return rating;
    }

}
