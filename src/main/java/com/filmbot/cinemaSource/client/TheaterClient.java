package com.filmbot.cinemaSource.client;

import com.filmbot.cinemaSource.client.domain.*;
import com.filmbot.domain.Theater;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.thoughtworks.xstream.XStream;

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

    public List<CinemaSourceHouse> testFindTheaters() {

        XStream xstream = TheaterClient.initXstream();
        Client client = Client.create();

        WebResource webResource = client
                .resource("http://webservice.cinema-source.com/2.9/?apikey=NYBOT&query=location&city=New%20York&state=NY&sd=yes&schedule=yes&movies=yes");

        ClientResponse response = webResource.type("application/xml")
                .get(ClientResponse.class);

        System.out.println("Output from Server .... \n");
        String output = response.getEntity(String.class);
        System.out.println(output);

        List<CinemaSourceLocation> location = (List<CinemaSourceLocation>) xstream.fromXML(output);
        return location.get(0).getTheaters().get(0).getHouses();


    }
}
