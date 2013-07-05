package com.filmbot.cinemaSource.client;

import com.filmbot.cinemaSource.client.domain.CinemaSourceHouse;
import com.filmbot.cinemaSource.client.domain.CinemaSourceLocation;
import com.filmbot.cinemaSource.client.domain.CinemaSourceTheaters;
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
    public List<Theater> testFindTheaters() {

        XStream xstream = new XStream();
        xstream.alias("location", CinemaSourceLocation.class);
        xstream.alias("theaters", CinemaSourceTheaters.class);
        xstream.alias("house", CinemaSourceHouse.class);

        try {

            Client client = Client.create();

            WebResource webResource = client
                    .resource("http://webservice.cinema-source.com/2.9/?apikey=NYBOT&query=location&city=New%20York&state=NY&sd=yes&schedule=yes&movies=yes");

            ClientResponse response = webResource.type("application/xml")
                    .get(ClientResponse.class);

            System.out.println("Output from Server .... \n");
            String output = response.getEntity(String.class);
            System.out.println(output);




        } catch (Exception e) {

            e.printStackTrace();

        }

        return null;

    }
}
