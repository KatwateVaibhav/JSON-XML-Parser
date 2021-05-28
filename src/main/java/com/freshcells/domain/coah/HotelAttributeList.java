package com.freshcells.domain.coah;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class HotelAttributeList {

    @XmlAttribute
    private String source;

    @XmlElement(name = "attribute")
    private List<HotelAttribute> attributes;

    public List<HotelAttribute> getAttributes() {
        return attributes;
    }

}
