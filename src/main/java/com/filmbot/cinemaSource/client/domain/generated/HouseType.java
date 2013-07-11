
package com.filmbot.cinemaSource.client.domain.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for houseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="houseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="house_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{}addressType"/>
 *         &lt;element name="attributes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="handicap"/>
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="handicap, hearing"/>
 *               &lt;enumeration value="hearing"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ticketing">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="False"/>
 *               &lt;enumeration value="True"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="closed_reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locdesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="market" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="screens" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Stadium, Rocking chairs"/>
 *               &lt;enumeration value="Stadium"/>
 *               &lt;enumeration value="Stadium, Rocking chairs, Love seats"/>
 *               &lt;enumeration value="Reserved"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="extra">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="False"/>
 *               &lt;enumeration value="True"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pricing" type="{}pricingType"/>
 *         &lt;element name="sounds" type="{}soundsType"/>
 *         &lt;element name="geolocation" type="{}geolocationType"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fan_ticketing">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fan_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tms_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schedule">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="movie" type="{}movieType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "houseType", propOrder = {
    "name",
    "houseId",
    "address",
    "attributes",
    "ticketing",
    "closedReason",
    "locdesc",
    "market",
    "screens",
    "seating",
    "extra",
    "website",
    "pricing",
    "sounds",
    "geolocation",
    "distance",
    "fanTicketing",
    "fanId",
    "tmsId",
    "schedule"
})
public class HouseType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "house_id", required = true)
    protected String houseId;
    @XmlElement(required = true)
    protected AddressType address;
    @XmlElement(required = true)
    protected String attributes;
    @XmlElement(required = true)
    protected String ticketing;
    @XmlElement(name = "closed_reason", required = true)
    protected String closedReason;
    @XmlElement(required = true)
    protected String locdesc;
    @XmlElement(required = true)
    protected String market;
    @XmlElement(required = true)
    protected String screens;
    @XmlElement(required = true)
    protected String seating;
    @XmlElement(required = true)
    protected String extra;
    @XmlElement(required = true)
    protected String website;
    @XmlElement(required = true)
    protected PricingType pricing;
    @XmlElement(required = true)
    protected SoundsType sounds;
    @XmlElement(required = true)
    protected GeolocationType geolocation;
    @XmlElement(required = true)
    protected String distance;
    @XmlElement(name = "fan_ticketing", required = true)
    protected String fanTicketing;
    @XmlElement(name = "fan_id", required = true)
    protected String fanId;
    @XmlElement(name = "tms_id", required = true)
    protected String tmsId;
    @XmlElement(required = true)
    protected HouseType.Schedule schedule;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the houseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseId() {
        return houseId;
    }

    /**
     * Sets the value of the houseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseId(String value) {
        this.houseId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributes(String value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketing() {
        return ticketing;
    }

    /**
     * Sets the value of the ticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketing(String value) {
        this.ticketing = value;
    }

    /**
     * Gets the value of the closedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosedReason() {
        return closedReason;
    }

    /**
     * Sets the value of the closedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosedReason(String value) {
        this.closedReason = value;
    }

    /**
     * Gets the value of the locdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocdesc() {
        return locdesc;
    }

    /**
     * Sets the value of the locdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocdesc(String value) {
        this.locdesc = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * Gets the value of the screens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreens() {
        return screens;
    }

    /**
     * Sets the value of the screens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreens(String value) {
        this.screens = value;
    }

    /**
     * Gets the value of the seating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeating() {
        return seating;
    }

    /**
     * Sets the value of the seating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeating(String value) {
        this.seating = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtra(String value) {
        this.extra = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setPricing(PricingType value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the sounds property.
     * 
     * @return
     *     possible object is
     *     {@link SoundsType }
     *     
     */
    public SoundsType getSounds() {
        return sounds;
    }

    /**
     * Sets the value of the sounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoundsType }
     *     
     */
    public void setSounds(SoundsType value) {
        this.sounds = value;
    }

    /**
     * Gets the value of the geolocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeolocationType }
     *     
     */
    public GeolocationType getGeolocation() {
        return geolocation;
    }

    /**
     * Sets the value of the geolocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeolocationType }
     *     
     */
    public void setGeolocation(GeolocationType value) {
        this.geolocation = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the fanTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFanTicketing() {
        return fanTicketing;
    }

    /**
     * Sets the value of the fanTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFanTicketing(String value) {
        this.fanTicketing = value;
    }

    /**
     * Gets the value of the fanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFanId() {
        return fanId;
    }

    /**
     * Sets the value of the fanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFanId(String value) {
        this.fanId = value;
    }

    /**
     * Gets the value of the tmsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmsId() {
        return tmsId;
    }

    /**
     * Sets the value of the tmsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmsId(String value) {
        this.tmsId = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link HouseType.Schedule }
     *     
     */
    public HouseType.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseType.Schedule }
     *     
     */
    public void setSchedule(HouseType.Schedule value) {
        this.schedule = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="movie" type="{}movieType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Schedule {

        @XmlElementRef(name = "movie", type = JAXBElement.class)
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link MovieType }{@code >}
         * {@link String }
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}
