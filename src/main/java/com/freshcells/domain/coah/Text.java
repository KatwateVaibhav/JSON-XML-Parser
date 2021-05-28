package com.freshcells.domain.coah;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vaibhav
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Text {

    @XmlAttribute
    private String tourOperator;
    @XmlAttribute
    private String source;
    @XmlAttribute
    private String tourOperatorString;
    @XmlAttribute
    private String id;
    @XmlAttribute
    private String name;
    @XmlElement(name = "paragraph")
    private List<Paragraph> paragraphs;
    private String copyrightText;

    public String getTourOperator() {
        return tourOperator;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public String getCopyrightText() {
        return copyrightText;
    }

}
