
package com.filmbot.cinemaSource.client.domain.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.filmbot.cinemaSource.client.domain.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Location_QNAME = new QName("", "location");
    private final static QName _ActorsTypeActor_QNAME = new QName("", "actor");
    private final static QName _DirectorsTypeDirector_QNAME = new QName("", "director");
    private final static QName _HouseTypeScheduleMovie_QNAME = new QName("", "movie");
    private final static QName _ReleaseDatesTypeReleaseintl_QNAME = new QName("", "releaseintl");
    private final static QName _ReleaseDatesTypeRelease_QNAME = new QName("", "release");
    private final static QName _ProducersTypeProducer_QNAME = new QName("", "producer");
    private final static QName _PhotosTypePhoto_QNAME = new QName("", "photo");
    private final static QName _WritersTypeWriter_QNAME = new QName("", "writer");
    private final static QName _SoundsTypeSound_QNAME = new QName("", "sound");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.filmbot.cinemaSource.client.domain.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReleaseType }
     * 
     */
    public ReleaseType createReleaseType() {
        return new ReleaseType();
    }

    /**
     * Create an instance of {@link GeolocationType }
     * 
     */
    public GeolocationType createGeolocationType() {
        return new GeolocationType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link DirectorsType }
     * 
     */
    public DirectorsType createDirectorsType() {
        return new DirectorsType();
    }

    /**
     * Create an instance of {@link RatingsType }
     * 
     */
    public RatingsType createRatingsType() {
        return new RatingsType();
    }

    /**
     * Create an instance of {@link ReleaseintlType }
     * 
     */
    public ReleaseintlType createReleaseintlType() {
        return new ReleaseintlType();
    }

    /**
     * Create an instance of {@link MoviesType }
     * 
     */
    public MoviesType createMoviesType() {
        return new MoviesType();
    }

    /**
     * Create an instance of {@link ProducersType }
     * 
     */
    public ProducersType createProducersType() {
        return new ProducersType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link PhotosType }
     * 
     */
    public PhotosType createPhotosType() {
        return new PhotosType();
    }

    /**
     * Create an instance of {@link WritersType }
     * 
     */
    public WritersType createWritersType() {
        return new WritersType();
    }

    /**
     * Create an instance of {@link MovieType }
     * 
     */
    public MovieType createMovieType() {
        return new MovieType();
    }

    /**
     * Create an instance of {@link HouseType }
     * 
     */
    public HouseType createHouseType() {
        return new HouseType();
    }

    /**
     * Create an instance of {@link ActorsType }
     * 
     */
    public ActorsType createActorsType() {
        return new ActorsType();
    }

    /**
     * Create an instance of {@link HouseType.Schedule }
     * 
     */
    public HouseType.Schedule createHouseTypeSchedule() {
        return new HouseType.Schedule();
    }

    /**
     * Create an instance of {@link ScheduleType }
     * 
     */
    public ScheduleType createScheduleType() {
        return new ScheduleType();
    }

    /**
     * Create an instance of {@link ReleaseDatesType }
     * 
     */
    public ReleaseDatesType createReleaseDatesType() {
        return new ReleaseDatesType();
    }

    /**
     * Create an instance of {@link GenresType }
     * 
     */
    public GenresType createGenresType() {
        return new GenresType();
    }

    /**
     * Create an instance of {@link ShowtimesType }
     * 
     */
    public ShowtimesType createShowtimesType() {
        return new ShowtimesType();
    }

    /**
     * Create an instance of {@link PricingType }
     * 
     */
    public PricingType createPricingType() {
        return new PricingType();
    }

    /**
     * Create an instance of {@link TheatersType }
     * 
     */
    public TheatersType createTheatersType() {
        return new TheatersType();
    }

    /**
     * Create an instance of {@link SoundsType }
     * 
     */
    public SoundsType createSoundsType() {
        return new SoundsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actor", scope = ActorsType.class)
    public JAXBElement<String> createActorsTypeActor(String value) {
        return new JAXBElement<String>(_ActorsTypeActor_QNAME, String.class, ActorsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "director", scope = DirectorsType.class)
    public JAXBElement<String> createDirectorsTypeDirector(String value) {
        return new JAXBElement<String>(_DirectorsTypeDirector_QNAME, String.class, DirectorsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovieType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "movie", scope = HouseType.Schedule.class)
    public JAXBElement<MovieType> createHouseTypeScheduleMovie(MovieType value) {
        return new JAXBElement<MovieType>(_HouseTypeScheduleMovie_QNAME, MovieType.class, HouseType.Schedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseintlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "releaseintl", scope = ReleaseDatesType.class)
    public JAXBElement<ReleaseintlType> createReleaseDatesTypeReleaseintl(ReleaseintlType value) {
        return new JAXBElement<ReleaseintlType>(_ReleaseDatesTypeReleaseintl_QNAME, ReleaseintlType.class, ReleaseDatesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "release", scope = ReleaseDatesType.class)
    public JAXBElement<ReleaseType> createReleaseDatesTypeRelease(ReleaseType value) {
        return new JAXBElement<ReleaseType>(_ReleaseDatesTypeRelease_QNAME, ReleaseType.class, ReleaseDatesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "producer", scope = ProducersType.class)
    public JAXBElement<String> createProducersTypeProducer(String value) {
        return new JAXBElement<String>(_ProducersTypeProducer_QNAME, String.class, ProducersType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "photo", scope = PhotosType.class)
    public JAXBElement<String> createPhotosTypePhoto(String value) {
        return new JAXBElement<String>(_PhotosTypePhoto_QNAME, String.class, PhotosType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "writer", scope = WritersType.class)
    public JAXBElement<String> createWritersTypeWriter(String value) {
        return new JAXBElement<String>(_WritersTypeWriter_QNAME, String.class, WritersType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sound", scope = SoundsType.class)
    public JAXBElement<String> createSoundsTypeSound(String value) {
        return new JAXBElement<String>(_SoundsTypeSound_QNAME, String.class, SoundsType.class, value);
    }

}
