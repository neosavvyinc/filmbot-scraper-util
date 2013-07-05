package com.filmbot.cinemaSource.client;


import com.filmbot.cinemaSource.client.domain.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.junit.Test;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 1:17 PM
 */
public class TheaterClientTest {

    private TheaterClient client = new TheaterClient();


    @Test
    public void testGetTheaters() {

        client.testFindTheaters();

    }

    @Test
    public void testSerialization() {
        XStream xstream = new XStream(new DomDriver());

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




        CinemaSourceLocation o = (CinemaSourceLocation) xstream.fromXML("<?xml version='1.0' encoding='ISO-8859-1'?>\n" +
                "<location>\n" +
                "    <theaters>\n" +
                "        <house>\n" +
                "            <name>Magno Screening Room</name>\n" +
                "            <house_id>29680</house_id>\n" +
                "            <address>\n" +
                "                <street>729 Seventh Avenue</street>\n" +
                "                <city>New York</city>\n" +
                "                <state>NY</state>\n" +
                "                <zip>10019</zip>\n" +
                "                <country>USA</country>\n" +
                "                <phone>(212)302-2505</phone>\n" +
                "                <county>New York</county>\n" +
                "            </address>\n" +
                "            <attributes></attributes>\n" +
                "            <ticketing>False</ticketing>\n" +
                "            <closed_reason></closed_reason>\n" +
                "            <locdesc>729 Seventh Avenue</locdesc>\n" +
                "            <market>New York</market>\n" +
                "            <screens>2</screens>\n" +
                "            <seating></seating>\n" +
                "            <extra>False</extra>\n" +
                "            <website></website>\n" +
                "            <pricing>\n" +
                "                <adult></adult>\n" +
                "                <child></child>\n" +
                "                <senior></senior>\n" +
                "            </pricing>\n" +
                "            <sounds></sounds>\n" +
                "            <geolocation>\n" +
                "                <lat>40.7602</lat>\n" +
                "                <lon>-73.9838</lon>\n" +
                "            </geolocation>\n" +
                "            <distance></distance>\n" +
                "            <fan_ticketing>0</fan_ticketing>\n" +
                "            <fan_id>0</fan_id>\n" +
                "            <tms_id></tms_id>\n" +
                "            <schedule></schedule>\n" +
                "        </house></theaters></location>");


        CinemaSourceLocation o1 = (CinemaSourceLocation) xstream.fromXML("<?xml version='1.0' encoding='ISO-8859-1'?>\n" +
                "<location>\n" +
                "    <theaters>\n" +
                "       <house>\n" +
                "        <name>AMC Loews 84th Street 6</name>\n" +
                        "        <house_id>11</house_id>\n" +
                        "        <address>\n" +
                        "        <street>2310 Broadway</street>\n" +
                        "        <city>New York</city>\n" +
                        "        <state>NY</state>\n" +
                        "        <zip>10024</zip>\n" +
                        "        <country>USA</country>\n" +
                        "        <phone>(888)AMC-4FUN</phone>\n" +
                        "        <county>New York</county>\n" +
                        "        </address>\n" +
                        "        <attributes>handicap, hearing</attributes>\n" +
                        "        <ticketing>False</ticketing>\n" +
                        "        <closed_reason></closed_reason>\n" +
                        "        <locdesc>2310 Broadway</locdesc>\n" +
                        "        <market>New York</market>\n" +
                        "        <screens>6</screens>\n" +
                        "        <seating></seating>\n" +
                        "        <extra>False</extra>\n" +
                        "        <website>www.AMCTheatres.com</website>\n" +
                        "        <pricing>\n" +
                        "        <adult>$13.00</adult>\n" +
                        "        <child>$9.50</child>\n" +
                        "        <senior>$9.50</senior>\n" +
                        "        </pricing>\n" +
                        "        <sounds>\n" +
                        "        <sound>Dolby</sound>\n" +
                        "        </sounds>\n" +
                        "        <geolocation>\n" +
                        "        <lat>40.7866</lat>\n" +
                        "        <lon>-73.9776</lon>\n" +
                        "        </geolocation>\n" +
                        "        <distance></distance>\n" +
                        "        <fan_ticketing>1</fan_ticketing>\n" +
                        "        <fan_id>112</fan_id>\n" +
                        "        <tms_id>AABQA</tms_id>\n" +
                        "        <schedule>\n" +
                        "        <movie>\n" +
                        "        <movie_id>112449</movie_id>\n" +
                        "        <movie_name>Man of Steel</movie_name>\n" +
                        "        <movie_rating>PG-13</movie_rating>\n" +
                        "        <showtimes date='7/5/2013' attributes='' sound='Digital' allowpasses='Yes'\n" +
                        "        comments='Digital Presentation'>\n" +
                        "        <showtime>09:45</showtime>\n" +
                        "        <showtime>16:10</showtime>\n" +
                        "        <showtime>19:30</showtime>\n" +
                        "        </showtimes>\n" +
                        "        </movie>\n" +
                        "        <movie>\n" +
                        "        <movie_id>112449</movie_id>\n" +
                        "        <movie_name>Man of Steel</movie_name>\n" +
                        "        <movie_rating>PG-13</movie_rating>\n" +
                        "        <showtimes date='7/5/2013' attributes='' sound='Digital' allowpasses='Yes'\n" +
                        "        comments='Digital Presentation'>\n" +
                        "        <showtime>09:45</showtime>\n" +
                        "        <showtime>16:10</showtime>\n" +
                        "        <showtime>19:30</showtime>\n" +
                        "        </showtimes>\n" +
                        "        </movie>\n" +
                        "        </schedule>\n" +
                        "        </house>\n" +
                        "   </theaters>\n" +
                        "</location>\n");


    }

}
