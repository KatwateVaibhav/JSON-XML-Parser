package com.freshcells.domain.coah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DetailedRating {

    private RatingType averageRating;
    private RatingType hotelRating;
    private RatingType locationRating;
    private RatingType serviceRating;
    private RatingType foodRating;
    private RatingType roomRating;
    private RatingType sportRating;
    private RatingType recommendation;

    public RatingType getSportRating() {
        return sportRating;
    }

}
