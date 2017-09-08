import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jackbrashier on 9/8/17.
 */
public class PopulationTest {

    @Test
    public void findPop() {
        Population testPop = new Population();
        double actualPop = Population.findPop(1000000, 1);
        assertEquals(3780096, actualPop, Math.abs(3780096 - actualPop));
    }
}
