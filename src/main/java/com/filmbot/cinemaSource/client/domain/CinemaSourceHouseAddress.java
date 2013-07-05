package com.filmbot.cinemaSource.client.domain;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:15 PM
 */

/*
<address>
    <street>2310 Broadway</street>
    <city>New York</city>
    <state>NY</state>
    <zip>10024</zip>
    <country>USA</country>
    <phone>(888)AMC-4FUN</phone>
    <county>New York</county>
</address>
 */
public class CinemaSourceHouseAddress {

    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String county;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
