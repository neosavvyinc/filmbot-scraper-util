import com.filmbot.dao.BaseDAOTest;
import com.filmbot.dao.FilmDAO;
import com.filmbot.dao.ShowtimeDAO;
import com.filmbot.dao.TheaterDAO;
import org.junit.Before;
import org.junit.Test;
import org.skife.jdbi.v2.logging.PrintStreamLog;

import java.util.List;
import java.util.Map;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/23/13
 * Time: 11:10 PM
 */
public class GoogleScraperOrchestratorTest extends BaseDAOTest {

    private ShowtimeDAO showtimeDAO;
    private FilmDAO filmDAO;
    private TheaterDAO theaterDAO;

    @Before
    public void setup() {
        showtimeDAO = handle.attach(ShowtimeDAO.class);
        filmDAO = handle.attach(FilmDAO.class);
        theaterDAO = handle.attach(TheaterDAO.class);
        handle.setSQLLog(new PrintStreamLog());
    }


    /**
     * This is the biggest integration test ever
     */
    @Test
    public void testOrchestrateForOneTheater() {
        handle.execute("INSERT INTO theater_theater ( id, name, address, city_id, neighbourHood_id ) " +
                "VALUES (0, 'Williamsburg Cinemas', '', -1, -1)");
        List<Map<String,Object>> select = handle.select("select id from theater_theater where name like 'Williamsburg Cinemas'");
        Integer id = (Integer) select.get(0).get("id");
        handle.execute("INSERT INTO theater_theaterdetailed ( theater_ptr_id, mapInfo_id, legacyCinema_id, ticketingInfo_id, weight, googleUrl, homePage) " +
                "VALUES ("+id+", -1, -1, -1, -1, 'http://www.google.com/movies?near=11211&tid=5ae3b5994480e6f3', '')");


        GoogleScraperOrchestrator orchestrator = new GoogleScraperOrchestrator();

        orchestrator.orchestrate();

    }

}
