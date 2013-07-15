package com.filmbot.domain;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:19 AM
 */
public class Theater {

    private Integer id = -1;
    private String name;
    private String address;
    private String phone;

    private String sourceUrl;
    private int cinemaSourceId;

    public Theater(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Theater)) return false;

        Theater theater = (Theater) o;

        if (address != null ? !address.equals(theater.address) : theater.address != null) return false;
        if (id != null ? !id.equals(theater.id) : theater.id != null) return false;
        if (name != null ? !name.equals(theater.name) : theater.name != null) return false;
        if (phone != null ? !phone.equals(theater.phone) : theater.phone != null) return false;
        if (sourceUrl != null ? !sourceUrl.equals(theater.sourceUrl) : theater.sourceUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (sourceUrl != null ? sourceUrl.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                '}';
    }

    public void setCinemaSourceId(int cinemaSourceId) {
        this.cinemaSourceId = cinemaSourceId;
    }

    public int getCinemaSourceId() {
        return cinemaSourceId;
    }
}
