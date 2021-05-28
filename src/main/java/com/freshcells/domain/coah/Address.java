package com.freshcells.domain.coah;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

    private String zip;
    private String city;
    private String country;
    @XmlElementWrapper(name = "formatted")
    @XmlElement(name = "line")
    private List<String> lines;

    public List<String> getLines() {
        return lines;
    }

    public String getCity() {
        return city;
    }

}
