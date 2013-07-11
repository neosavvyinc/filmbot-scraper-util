
package com.filmbot.cinemaSource.client.domain.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="child" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senior" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricingType", propOrder = {
    "adult",
    "child",
    "senior"
})
public class PricingType {

    @XmlElement(required = true)
    protected String adult;
    @XmlElement(required = true)
    protected String child;
    @XmlElement(required = true)
    protected String senior;

    /**
     * Gets the value of the adult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdult() {
        return adult;
    }

    /**
     * Sets the value of the adult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdult(String value) {
        this.adult = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChild(String value) {
        this.child = value;
    }

    /**
     * Gets the value of the senior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenior() {
        return senior;
    }

    /**
     * Sets the value of the senior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenior(String value) {
        this.senior = value;
    }

}
