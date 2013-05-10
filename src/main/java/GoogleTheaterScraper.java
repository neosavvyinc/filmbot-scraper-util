import com.filmbot.domain.ScraperConstants;
import com.filmbot.domain.Theater;
import com.filmbot.util.JsoupUtil;
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
public class GoogleTheaterScraper implements ScraperConstants {

    public List<Theater> findTheatersForUrl(String url) throws IOException {

        Document baseDocument = JsoupUtil.getDocument(url);

        Elements theater = baseDocument.select(".theater .desc .name");
        Iterator<Element> theaterIterator = theater.iterator();

        ArrayList<Theater> theatersFound = new ArrayList<Theater>();

        while(theaterIterator.hasNext()) {

            Element theaterChild = theaterIterator.next();
            System.out.println(theaterChild.text());
            theatersFound.add(new Theater(theaterChild.text()));

        }

        return theatersFound;

    }

    public Theater findFirstTheaterForUrl(String url) throws IOException {

        Document baseDocument = JsoupUtil.getDocument(url);

        Elements theater = baseDocument.select(".theater .desc .name");
        Iterator<Element> theaterIterator = theater.iterator();

        while(theaterIterator.hasNext()) {

            Element theaterChild = theaterIterator.next();
            return new Theater(theaterChild.text());

        }

        return null;

    }

}