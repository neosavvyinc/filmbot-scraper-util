import org.junit.Test;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/11/13
 * Time: 9:15 PM
 */
public class CinemaSourceOrchestratorTest {

    @Test
    public void testOrchestrator() {
        CinemaSourceOrchestrator orchestrator = new CinemaSourceOrchestrator();

        CinemaSourceOrchestrator.dbUserName  = "filmbot_20";
        CinemaSourceOrchestrator.dbPassword  = "filmbot_20";
        CinemaSourceOrchestrator.dbName      = "filmbot_20_development";

        orchestrator.orchestrate();
    }

}
