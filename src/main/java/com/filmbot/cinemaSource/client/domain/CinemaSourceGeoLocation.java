package com.filmbot.cinemaSource.client.domain;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:22 PM
 */
/*
<geolocation>
    <lat>40.7866</lat>
    <lon>-73.9776</lon>
</geolocation>
 */
public class CinemaSourceGeoLocation {

    private String lat;
    private String lon;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
