import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("Waverley", 30);
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanAddPassenger() {
        bus.addPassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCanRemovePassenger() {
        bus.removePassenger();

        assertEquals();
    }

}
