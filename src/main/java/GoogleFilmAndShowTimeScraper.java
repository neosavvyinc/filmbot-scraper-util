import com.filmbot.domain.Film;
import com.filmbot.domain.ScraperConstants;
import com.filmbot.domain.Showtime;
import com.filmbot.domain.Theater;
import com.filmbot.util.JsoupUtil;
import com.filmbot.util.RuntimeUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/9/13
 * Time: 9:00 PM
 */
public class GoogleFilmAndShowTimeScraper implements ScraperConstants {

    public List<Film> findFilmsForTheater(Theater theater) throws IOException {
        List<Film> films = new ArrayList<Film>();

        Document baseDocument = JsoupUtil.getDocument(theater.getSourceUrl());

        Elements filmElements = baseDocument.select(".theater .showtimes .movie .name");
        Iterator<Element> filmIterator = filmElements.iterator();

        while(filmIterator.hasNext()) {

            Element filmChild = filmIterator.next();
            System.out.println(filmChild.text());
            films.add(new Film(filmChild.text(), theater));

        }

        return films;

    }

    public List<Showtime> findShowtimesForTheaterAndFilm(Theater theater, Film film) throws IOException {

        List<Showtime> showtimes = new ArrayList<Showtime>();
        Document baseDocument = JsoupUtil.getDocument(theater.getSourceUrl());

        String selector = ".theater .showtimes .movie .name"; //selects a movie
        Elements filmElements = baseDocument.select(selector);

        for (Element filmElement : filmElements) {

            if( film.getName().equals(filmElement.text()) ) {

                Elements showtimeElements = filmElement.parent().select(".times span");
                Iterator<Element> filmIterator = showtimeElements.iterator();

                while(filmIterator.hasNext()) {

                    Element showtimeElement = filmIterator.next();

                    if(RuntimeUtil.isValidRuntime(showtimeElement.text())) {
                        showtimes.add(new Showtime(film, showtimeElement.text()));
                    }

                }

                break;

            }

        }

        return showtimes;

    }

}
