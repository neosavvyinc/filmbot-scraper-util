package com.filmbot.domain;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class Film {

    private Long id = -1L;
    private String name;
    private List<Showtime> showTimes;
    private Theater theater;

}
