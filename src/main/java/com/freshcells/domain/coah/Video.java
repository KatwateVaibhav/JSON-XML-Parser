package com.freshcells.domain.coah;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vaibhav
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Video {

    @XmlElementWrapper(name = "urls")
    @XmlElement(name = "url")
    private List<VideoURL> urls;

    public List<VideoURL> getUrls() {
        return urls;
    }

}
