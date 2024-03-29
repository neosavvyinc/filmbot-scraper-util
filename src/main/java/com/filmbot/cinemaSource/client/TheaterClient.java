package com.filmbot.cinemaSource.client;

import com.filmbot.cinemaSource.client.domain.*;
import com.filmbot.cinemaSource.client.domain.generated.HouseType;
import com.filmbot.cinemaSource.client.domain.generated.LocationType;
import com.filmbot.domain.Theater;
import com.filmbot.util.TimeUtil;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.thoughtworks.xstream.XStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 1:17 PM
 */
public class TheaterClient {
    static XStream initXstream() {
        XStream xstream = new XStream();

        xstream.processAnnotations(CinemaSourceDistance.class);
        xstream.processAnnotations(CinemaSourceHouseAddress.class);
        xstream.processAnnotations(CinemaSourcePricing.class);
        xstream.processAnnotations(CinemaSourceSound.class);
        xstream.processAnnotations(CinemaSourceGeoLocation.class);

        xstream.processAnnotations(CinemaSourceShowtime.class);
        xstream.processAnnotations(CinemaSourceMovie.class);
        xstream.processAnnotations(CinemaSourceSchedule.class);

        xstream.processAnnotations(CinemaSourceHouse.class);
        xstream.processAnnotations(CinemaSourceTheaters.class);
        xstream.processAnnotations(CinemaSourceLocation.class);
        return xstream;
    }

    public List<HouseType> findShowtimesForAllTheaters() {

        XStream xstream = TheaterClient.initXstream();
        Client client = Client.create();

        /**
         * Extract these out to a properties/configuration file
         */
        String[] urlsToParse = new String[3];
        urlsToParse[0] = "http://webservice.cinema-source.com/2.9/?apikey=NYBOT&query=location&city=Long%20Island%20City&state=NY&sd=yes&schedule=yes&movies=yes&showdate=$startDate&enddate=$endDate";
        urlsToParse[1] = "http://webservice.cinema-source.com/2.9/?apikey=NYBOT&query=location&city=Brooklyn&state=NY&sd=yes&schedule=yes&movies=yes&showdate=$startDate&enddate=$endDate";
        urlsToParse[2] = "http://webservice.cinema-source.com/2.9/?apikey=NYBOT&query=location&city=New%20York&state=NY&sd=yes&schedule=yes&movies=yes&showdate=$startDate&enddate=$endDate";

        String startDateString = TimeUtil.getDateStringForOffset(0);
        String endDateString = TimeUtil.getDateStringForOffset(4);

        List<HouseType> allHouses = new ArrayList<HouseType>();

        for (String s : urlsToParse) {

            s = s.replace("$startDate", startDateString);
            s = s.replace("$endDate", endDateString);

            WebResource webResource = client
                    .resource(s);

            ClientResponse response = webResource.type("application/xml")
                    .get(ClientResponse.class);

            System.out.println("Output from Server .... \n");
            String output = response.getEntity(String.class);
            System.out.println(output);

            File temp = null;

            try {
                temp = File.createTempFile(" cinemasource", ".tmp");
                temp.deleteOnExit();

                BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
                bw.write(output);
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(LocationType.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Source source = new StreamSource(temp);
                JAXBElement<LocationType> root = jaxbUnmarshaller.unmarshal(source, LocationType.class);
                LocationType location = root.getValue();

                allHouses.addAll(location.getTheaters().getHouse());
            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }

        return allHouses;
    }
}
