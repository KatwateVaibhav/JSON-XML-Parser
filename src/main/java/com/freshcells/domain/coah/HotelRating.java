package com.freshcells.domain.coah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class HotelRating {

    @XmlAttribute
    private String source;
    private Long hc_id;
    private Float recommendation_rate;
    private Float rating;
    private Long reviews;
    private String url;
    private DetailedRating detailedRating;

    public DetailedRating getDetailedRating() {
        return detailedRating;
    }

}
