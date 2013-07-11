
package com.filmbot.cinemaSource.client.domain.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="theaters" type="{}theatersType"/>
 *         &lt;element name="movies" type="{}moviesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationType", propOrder = {
    "theaters",
    "movies"
})
public class LocationType {

    @XmlElement(required = true)
    protected TheatersType theaters;
    @XmlElement(required = true)
    protected MoviesType movies;

    /**
     * Gets the value of the theaters property.
     * 
     * @return
     *     possible object is
     *     {@link TheatersType }
     *     
     */
    public TheatersType getTheaters() {
        return theaters;
    }

    /**
     * Sets the value of the theaters property.
     * 
     * @param value
     *     allowed object is
     *     {@link TheatersType }
     *     
     */
    public void setTheaters(TheatersType value) {
        this.theaters = value;
    }

    /**
     * Gets the value of the movies property.
     * 
     * @return
     *     possible object is
     *     {@link MoviesType }
     *     
     */
    public MoviesType getMovies() {
        return movies;
    }

    /**
     * Sets the value of the movies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoviesType }
     *     
     */
    public void setMovies(MoviesType value) {
        this.movies = value;
    }

}
