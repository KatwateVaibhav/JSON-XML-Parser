package com.freshcells.domain.coah;

import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.freshcells.domain.giata.GiataData;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Hotel {

    private GiataData giata;
    private Long giata_id;
    private Long iff;
    private String name;
    private Double latitude;
    private Double longitude;
    private Address address;
    private String phone;
    private String email;
    private String url;
    private String update_timestamp;
    @XmlElementWrapper(name = "texts")
    @XmlElement(name = "text")
    private List<Text> texts;
    private Usps usps;
    private String additionalTexts;
    @XmlElementWrapper(name = "images")
    @XmlElement(name = "image")
    private List<Image> images;
    @XmlElementWrapper(name = "videos")
    @XmlElement(name = "video")
    private List<Video> videos;
    private Attribute attributes;
    private HotelRating ratings;

    public GiataData getGiata() {
        return giata;
    }

    public void setGiata(GiataData giata) {
        this.giata = giata;
    }

    public Long getGiata_id() {
        return giata_id;
    }

    public Address getAddress() {
        return address;
    }

    public Usps getUsps() {
        return usps;
    }

    public List<Text> getTexts() {
        return texts;
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public Attribute getAttributes() {
        return attributes;
    }

    public HotelRating getRatings() {
        return ratings;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.giata_id);
        hash = 71 * hash + Objects.hashCode(this.iff);
        hash = 71 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.giata_id, other.giata_id)) {
            return false;
        }
        if (!Objects.equals(this.iff, other.iff)) {
            return false;
        }
        return true;
    }

}
