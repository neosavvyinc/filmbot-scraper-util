import com.filmbot.domain.Film;
import com.filmbot.domain.ScraperConstants;
import com.filmbot.domain.Showtime;
import com.filmbot.domain.Theater;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleFilmAndShowTimeScraper implements ScraperConstants {

    public List<Film> findFilmsForTheater(Theater theater) throws IOException {

        List<Film> films = new ArrayList<Film>();

        System.setProperty(HTTP_AGENT, "");
        Document baseDocument;

        baseDocument = Jsoup.connect(theater.getSourceUrl())
                .userAgent(MOZILLA_USER_AGENT)
                .get();

        //*[@id="movie_results"]/div/div/div[2]/div[1]/div[1]/div[1]

        Elements filmElements = baseDocument.select(".theater .showtimes .movie .name");
        Iterator<Element> filmIterator = filmElements.iterator();

        while(filmIterator.hasNext()) {

            Element filmChild = filmIterator.next();
            System.out.println(filmChild.text());
            films.add(new Film(filmChild.text(), theater));

        }

        return films;

    }

    public List<Showtime> findShowtimesForTheaterAndFilm(Theater theater, Film film) {

        List<Showtime> showtimes = new ArrayList<Showtime>();

        return showtimes;

    }

}
