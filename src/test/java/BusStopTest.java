import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("CodeClan");
        person = new Person();
    }

    @Test
    public void busStopStartsEmpty() {
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(2, busStop.getQueueSize());
    }
}
