
package com.filmbot.cinemaSource.client.domain.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="movieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movie_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="movie_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movie_rating" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PG-13"/>
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="NR"/>
 *               &lt;enumeration value="PG"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="showtimes" type="{}showtimesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="photos" type="{}photosType" minOccurs="0"/>
 *         &lt;element name="rating" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="NR"/>
 *               &lt;enumeration value="PG-13"/>
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="PG"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="advisory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genres" type="{}genresType" minOccurs="0"/>
 *         &lt;element name="actors" type="{}actorsType" minOccurs="0"/>
 *         &lt;element name="directors" type="{}directorsType" minOccurs="0"/>
 *         &lt;element name="producers" type="{}producersType" minOccurs="0"/>
 *         &lt;element name="writers" type="{}writersType" minOccurs="0"/>
 *         &lt;element name="release_dates" type="{}release_datesType" minOccurs="0"/>
 *         &lt;element name="synopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratings" type="{}ratingsType" minOccurs="0"/>
 *         &lt;element name="runtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mlang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent_id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="119411"/>
 *               &lt;enumeration value="120475"/>
 *               &lt;enumeration value="118779"/>
 *               &lt;enumeration value="115003"/>
 *               &lt;enumeration value="112449"/>
 *               &lt;enumeration value="120907"/>
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
@XmlType(name = "movieType", propOrder = {
    "title",
    "name",
    "movieId",
    "movieName",
    "movieRating",
    "showtimes",
    "photos",
    "rating",
    "advisory",
    "genres",
    "actors",
    "directors",
    "producers",
    "writers",
    "releaseDates",
    "synopsis",
    "ratings",
    "runtime",
    "distributor",
    "website",
    "mlang",
    "parentId"
})
public class MovieType {

    protected String title;
    protected String name;
    @XmlElement(name = "movie_id", required = true)
    protected String movieId;
    @XmlElement(name = "movie_name")
    protected String movieName;
    @XmlElement(name = "movie_rating")
    protected String movieRating;
    protected List<ShowtimesType> showtimes;
    protected PhotosType photos;
    protected String rating;
    protected String advisory;
    protected GenresType genres;
    protected ActorsType actors;
    protected DirectorsType directors;
    protected ProducersType producers;
    protected WritersType writers;
    @XmlElement(name = "release_dates")
    protected ReleaseDatesType releaseDates;
    protected String synopsis;
    protected RatingsType ratings;
    protected String runtime;
    protected String distributor;
    protected String website;
    protected String mlang;
    @XmlElement(name = "parent_id")
    protected String parentId;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

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
     * Gets the value of the movieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieId() {
        return movieId;
    }

    /**
     * Sets the value of the movieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieId(String value) {
        this.movieId = value;
    }

    /**
     * Gets the value of the movieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * Sets the value of the movieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieName(String value) {
        this.movieName = value;
    }

    /**
     * Gets the value of the movieRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieRating() {
        return movieRating;
    }

    /**
     * Sets the value of the movieRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieRating(String value) {
        this.movieRating = value;
    }

    /**
     * Gets the value of the showtimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the showtimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShowtimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShowtimesType }
     * 
     * 
     */
    public List<ShowtimesType> getShowtimes() {
        if (showtimes == null) {
            showtimes = new ArrayList<ShowtimesType>();
        }
        return this.showtimes;
    }

    /**
     * Gets the value of the photos property.
     * 
     * @return
     *     possible object is
     *     {@link PhotosType }
     *     
     */
    public PhotosType getPhotos() {
        return photos;
    }

    /**
     * Sets the value of the photos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotosType }
     *     
     */
    public void setPhotos(PhotosType value) {
        this.photos = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the advisory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisory() {
        return advisory;
    }

    /**
     * Sets the value of the advisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisory(String value) {
        this.advisory = value;
    }

    /**
     * Gets the value of the genres property.
     * 
     * @return
     *     possible object is
     *     {@link GenresType }
     *     
     */
    public GenresType getGenres() {
        return genres;
    }

    /**
     * Sets the value of the genres property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenresType }
     *     
     */
    public void setGenres(GenresType value) {
        this.genres = value;
    }

    /**
     * Gets the value of the actors property.
     * 
     * @return
     *     possible object is
     *     {@link ActorsType }
     *     
     */
    public ActorsType getActors() {
        return actors;
    }

    /**
     * Sets the value of the actors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActorsType }
     *     
     */
    public void setActors(ActorsType value) {
        this.actors = value;
    }

    /**
     * Gets the value of the directors property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorsType }
     *     
     */
    public DirectorsType getDirectors() {
        return directors;
    }

    /**
     * Sets the value of the directors property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorsType }
     *     
     */
    public void setDirectors(DirectorsType value) {
        this.directors = value;
    }

    /**
     * Gets the value of the producers property.
     * 
     * @return
     *     possible object is
     *     {@link ProducersType }
     *     
     */
    public ProducersType getProducers() {
        return producers;
    }

    /**
     * Sets the value of the producers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducersType }
     *     
     */
    public void setProducers(ProducersType value) {
        this.producers = value;
    }

    /**
     * Gets the value of the writers property.
     * 
     * @return
     *     possible object is
     *     {@link WritersType }
     *     
     */
    public WritersType getWriters() {
        return writers;
    }

    /**
     * Sets the value of the writers property.
     * 
     * @param value
     *     allowed object is
     *     {@link WritersType }
     *     
     */
    public void setWriters(WritersType value) {
        this.writers = value;
    }

    /**
     * Gets the value of the releaseDates property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseDatesType }
     *     
     */
    public ReleaseDatesType getReleaseDates() {
        return releaseDates;
    }

    /**
     * Sets the value of the releaseDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseDatesType }
     *     
     */
    public void setReleaseDates(ReleaseDatesType value) {
        this.releaseDates = value;
    }

    /**
     * Gets the value of the synopsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * Sets the value of the synopsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynopsis(String value) {
        this.synopsis = value;
    }

    /**
     * Gets the value of the ratings property.
     * 
     * @return
     *     possible object is
     *     {@link RatingsType }
     *     
     */
    public RatingsType getRatings() {
        return ratings;
    }

    /**
     * Sets the value of the ratings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingsType }
     *     
     */
    public void setRatings(RatingsType value) {
        this.ratings = value;
    }

    /**
     * Gets the value of the runtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * Sets the value of the runtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuntime(String value) {
        this.runtime = value;
    }

    /**
     * Gets the value of the distributor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributor() {
        return distributor;
    }

    /**
     * Sets the value of the distributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributor(String value) {
        this.distributor = value;
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
     * Gets the value of the mlang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlang() {
        return mlang;
    }

    /**
     * Sets the value of the mlang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlang(String value) {
        this.mlang = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

}
