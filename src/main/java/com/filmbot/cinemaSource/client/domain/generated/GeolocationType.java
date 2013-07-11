
package com.filmbot.cinemaSource.client.domain.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geolocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geolocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geolocationType", propOrder = {
    "lat",
    "lon"
})
public class GeolocationType {

    @XmlElement(required = true)
    protected String lat;
    @XmlElement(required = true)
    protected String lon;

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLat(String value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLon(String value) {
        this.lon = value;
    }

}
