package com.filmbot.cinemaSource.client.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:20 PM
 */
@XStreamAlias("sounds")
public class CinemaSourceSound {

    @XStreamImplicit
    private List<String> sound;

    public List<String> getSound() {
        return sound;
    }

    public void setSound(List<String> sound) {
        this.sound = sound;
    }
}
