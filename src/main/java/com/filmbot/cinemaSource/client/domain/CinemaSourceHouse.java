package com.filmbot.cinemaSource.client.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import java.util.Arrays;
import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 1:56 PM
 */



@XStreamAlias("house")
public class CinemaSourceHouse {

    @XStreamAlias("name")
    private String name;

    @XStreamAlias("house_id")
    private Integer house_id;

    @XStreamAlias("address")
    private CinemaSourceHouseAddress address;

    
    private String attributes;
    
    private Boolean ticketing;
    
    private String closed_reason;
    
    private String locdesc;
    
    private String market;
    
    private Integer screens;
    
    private String seating;
    
    private Boolean extra;
    
    private String website;

    
    private CinemaSourcePricing pricing;

    @XStreamAlias("sounds")
    private CinemaSourceSound sounds;
    
    private CinemaSourceGeoLocation geolocation;
    
    private CinemaSourceDistance distance;
    
    private String fan_ticketing;
    
    private String fan_id;
    
    private String tms_id;
//    
    @XStreamAlias("schedule")
    private CinemaSourceMovie[] schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHouse_id() {
        return house_id;
    }

    public void setHouse_id(Integer house_id) {
        this.house_id = house_id;
    }

    public CinemaSourceHouseAddress getAddress() {
        return address;
    }

    public void setAddress(CinemaSourceHouseAddress address) {
        this.address = address;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Boolean getTicketing() {
        return ticketing;
    }

    public void setTicketing(Boolean ticketing) {
        this.ticketing = ticketing;
    }

    public String getClosed_reason() {
        return closed_reason;
    }

    public void setClosed_reason(String closed_reason) {
        this.closed_reason = closed_reason;
    }

    public String getLocdesc() {
        return locdesc;
    }

    public void setLocdesc(String locdesc) {
        this.locdesc = locdesc;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public Integer getScreens() {
        return screens;
    }

    public void setScreens(Integer screens) {
        this.screens = screens;
    }

    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    public Boolean getExtra() {
        return extra;
    }

    public void setExtra(Boolean extra) {
        this.extra = extra;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public CinemaSourcePricing getPricing() {
        return pricing;
    }

    public void setPricing(CinemaSourcePricing pricing) {
        this.pricing = pricing;
    }

    public CinemaSourceSound getSounds() {
        return sounds;
    }

    public void setSounds(CinemaSourceSound sounds) {
        this.sounds = sounds;
    }

    public CinemaSourceGeoLocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(CinemaSourceGeoLocation geolocation) {
        this.geolocation = geolocation;
    }

    public CinemaSourceDistance getDistance() {
        return distance;
    }

    public void setDistance(CinemaSourceDistance distance) {
        this.distance = distance;
    }

    public String getFan_ticketing() {
        return fan_ticketing;
    }

    public void setFan_ticketing(String fan_ticketing) {
        this.fan_ticketing = fan_ticketing;
    }

    public String getFan_id() {
        return fan_id;
    }

    public void setFan_id(String fan_id) {
        this.fan_id = fan_id;
    }

    public String getTms_id() {
        return tms_id;
    }

    public void setTms_id(String tms_id) {
        this.tms_id = tms_id;
    }

    public CinemaSourceMovie[] getSchedule() {
        return schedule;
    }

    public void setSchedule(CinemaSourceMovie[] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "CinemaSourceHouse{" +
                "name='" + name + '\'' +
                ", house_id=" + house_id +
                ", address=" + address +
                ", attributes='" + attributes + '\'' +
                ", ticketing=" + ticketing +
                ", closed_reason='" + closed_reason + '\'' +
                ", locdesc='" + locdesc + '\'' +
                ", market='" + market + '\'' +
                ", screens=" + screens +
                ", seating='" + seating + '\'' +
                ", extra=" + extra +
                ", website='" + website + '\'' +
                ", pricing=" + pricing +
                ", sounds=" + sounds +
                ", geolocation=" + geolocation +
                ", distance=" + distance +
                ", fan_ticketing='" + fan_ticketing + '\'' +
                ", fan_id='" + fan_id + '\'' +
                ", tms_id='" + tms_id + '\'' +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
