package com.filmbot.dao;

import com.filmbot.domain.Film;
import com.filmbot.domain.Theater;
import org.junit.Test;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/9/13
 * Time: 9:00 PM
 */
public class FilmDAOTest extends BaseDAOTest {



    @Test
    public void testInsertOneFilm() {

        LOG.debug("BASEDAOTEST", new Film("Adams Film", new Theater("Adams Theater")));

    }
}
