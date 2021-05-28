package com.freshcells.domain.giata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Climate {

    @XmlAttribute
    private String kind;

    @XmlAttribute
    private Long id;

    private Months day_temperature;
    private Months night_temperature;
    private Months sunshine;
    private Months rainday;
    private Months water_temperature;

}
