package com.filmbot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/11/13
 * Time: 9:12 PM
 */
public abstract class BaseOrchestrator extends DaoEnabled {

    public abstract void orchestrate();

    protected void insertTheatersFromCSV() {
        String csvFile = "/FILMBOT/filmbot-scraper-utl/src/main/resources/theatersToScrape.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = "#";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] theater = line.split(cvsSplitBy);

                int theaterId = theaterDao.insertTheater(theater[0]);
                theaterDao.insertTheaterDetail(theaterId, theater[2]);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    protected void cleanupShowTimes() {
        handle.execute("truncate table showtime_showtime");
    }

}
