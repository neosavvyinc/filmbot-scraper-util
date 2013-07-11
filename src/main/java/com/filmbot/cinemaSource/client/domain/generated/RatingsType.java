
package com.filmbot.cinemaSource.client.domain.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ratingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ratingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="on-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14A"/>
 *               &lt;enumeration value="PG"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="18A"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bc-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14-A"/>
 *               &lt;enumeration value="PG"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="18-A"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nb-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nf-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ns-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pe-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="yt-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14-A"/>
 *               &lt;enumeration value="PG"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="18-A"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pq-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="13+"/>
 *               &lt;enumeration value="G"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sk-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14-A"/>
 *               &lt;enumeration value="PG"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="18-A"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ab-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="14-A"/>
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="PG"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="18-A"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mb-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="14A"/>
 *               &lt;enumeration value="PG"/>
 *               &lt;enumeration value="G"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="uk-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value="U"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="12A"/>
 *               &lt;enumeration value="UC"/>
 *               &lt;enumeration value="PG"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ire-rating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="NR"/>
 *               &lt;enumeration value="12A"/>
 *               &lt;enumeration value="15A"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="PG"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "ratingsType", propOrder = {
    "onRating",
    "bcRating",
    "nbRating",
    "nfRating",
    "nsRating",
    "peRating",
    "ytRating",
    "pqRating",
    "skRating",
    "abRating",
    "mbRating",
    "ukRating",
    "ireRating"
})
public class RatingsType {

    @XmlElement(name = "on-rating", required = true)
    protected String onRating;
    @XmlElement(name = "bc-rating", required = true)
    protected String bcRating;
    @XmlElement(name = "nb-rating", required = true)
    protected String nbRating;
    @XmlElement(name = "nf-rating", required = true)
    protected String nfRating;
    @XmlElement(name = "ns-rating", required = true)
    protected String nsRating;
    @XmlElement(name = "pe-rating", required = true)
    protected String peRating;
    @XmlElement(name = "yt-rating", required = true)
    protected String ytRating;
    @XmlElement(name = "pq-rating", required = true)
    protected String pqRating;
    @XmlElement(name = "sk-rating", required = true)
    protected String skRating;
    @XmlElement(name = "ab-rating", required = true)
    protected String abRating;
    @XmlElement(name = "mb-rating", required = true)
    protected String mbRating;
    @XmlElement(name = "uk-rating", required = true)
    protected String ukRating;
    @XmlElement(name = "ire-rating", required = true)
    protected String ireRating;

    /**
     * Gets the value of the onRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnRating() {
        return onRating;
    }

    /**
     * Sets the value of the onRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnRating(String value) {
        this.onRating = value;
    }

    /**
     * Gets the value of the bcRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcRating() {
        return bcRating;
    }

    /**
     * Sets the value of the bcRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBcRating(String value) {
        this.bcRating = value;
    }

    /**
     * Gets the value of the nbRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbRating() {
        return nbRating;
    }

    /**
     * Sets the value of the nbRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbRating(String value) {
        this.nbRating = value;
    }

    /**
     * Gets the value of the nfRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfRating() {
        return nfRating;
    }

    /**
     * Sets the value of the nfRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfRating(String value) {
        this.nfRating = value;
    }

    /**
     * Gets the value of the nsRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsRating() {
        return nsRating;
    }

    /**
     * Sets the value of the nsRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsRating(String value) {
        this.nsRating = value;
    }

    /**
     * Gets the value of the peRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeRating() {
        return peRating;
    }

    /**
     * Sets the value of the peRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeRating(String value) {
        this.peRating = value;
    }

    /**
     * Gets the value of the ytRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYtRating() {
        return ytRating;
    }

    /**
     * Sets the value of the ytRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYtRating(String value) {
        this.ytRating = value;
    }

    /**
     * Gets the value of the pqRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPqRating() {
        return pqRating;
    }

    /**
     * Sets the value of the pqRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPqRating(String value) {
        this.pqRating = value;
    }

    /**
     * Gets the value of the skRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkRating() {
        return skRating;
    }

    /**
     * Sets the value of the skRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkRating(String value) {
        this.skRating = value;
    }

    /**
     * Gets the value of the abRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbRating() {
        return abRating;
    }

    /**
     * Sets the value of the abRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbRating(String value) {
        this.abRating = value;
    }

    /**
     * Gets the value of the mbRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbRating() {
        return mbRating;
    }

    /**
     * Sets the value of the mbRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbRating(String value) {
        this.mbRating = value;
    }

    /**
     * Gets the value of the ukRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUkRating() {
        return ukRating;
    }

    /**
     * Sets the value of the ukRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUkRating(String value) {
        this.ukRating = value;
    }

    /**
     * Gets the value of the ireRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIreRating() {
        return ireRating;
    }

    /**
     * Sets the value of the ireRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIreRating(String value) {
        this.ireRating = value;
    }

}
