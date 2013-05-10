package com.filmbot.domain;

import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:49 AM
 */
public class Film {

    private Long id = -1L;
    private String name;
    private List<Showtime> showTimes;
    private Theater theater;

    public Film(String name, Theater theater) {
        this.name = name;
        this.theater = theater;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Showtime> getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(List<Showtime> showTimes) {
        this.showTimes = showTimes;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;

        Film film = (Film) o;

        if (id != null ? !id.equals(film.id) : film.id != null) return false;
        if (name != null ? !name.equals(film.name) : film.name != null) return false;
        if (showTimes != null ? !showTimes.equals(film.showTimes) : film.showTimes != null) return false;
        if (theater != null ? !theater.equals(film.theater) : film.theater != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (showTimes != null ? showTimes.hashCode() : 0);
        result = 31 * result + (theater != null ? theater.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", showTimes=" + showTimes +
                ", theater=" + theater +
                '}';
    }
}
