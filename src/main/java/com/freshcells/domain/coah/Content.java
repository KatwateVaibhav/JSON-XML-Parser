package com.freshcells.domain.coah;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * https://stackoverflow.com/questions/332591/performance-difference-between-annotating-fields-or-getter-methods-in-hibernate
 * The difference between @XmlAccessorType(XmlAccessType.FIELD) and
 *
 * @XmlAccessorType(XmlAccessType.PROPERTY) doesn't appear to be statistically
 * significant when tested by 5000 of data. But, for a very big data, property
 * is better to be used.
 * @author Vaibhav
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Content {

    @XmlElement(name = "hotel")
    private List<Hotel> hotels;

    public List<Hotel> getHotels() {
        return hotels;
    }

}
