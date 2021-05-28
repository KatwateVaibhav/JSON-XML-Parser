package com.freshcells.domain.giata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vaibhav
 */
@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
public class Giata {

    @XmlElement(name = "data")
    private GiataData giataData;

    public GiataData getGiataData() {
        return giataData;
    }

}
