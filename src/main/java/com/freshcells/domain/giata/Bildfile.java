package com.freshcells.domain.giata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Bildfile {

    @XmlAttribute
    private String typ;
    @XmlAttribute
    private Integer seq;
    @XmlAttribute
    private Integer size;
    @XmlAttribute
    private Integer width;
    @XmlAttribute
    private Integer height;
    @XmlAttribute
    private String id;
    @XmlValue
    private String url;

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

}
