import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop codeClan_BusStop;

    @Before
    public void before() {
        bus = new Bus("Waverley", 8);
        person = new Person();
        codeClan_BusStop = new BusStop("CodeClan");
        codeClan_BusStop.addPersonToQueue(person);
        codeClan_BusStop.addPersonToQueue(person);
        codeClan_BusStop.addPersonToQueue(person);
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanAddPassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void busCanRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUp(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.pickUp(codeClan_BusStop);
        bus.pickUp(codeClan_BusStop);
        bus.pickUp(codeClan_BusStop);
        assertEquals(6, bus.passengerCount());
        assertEquals(0,codeClan_BusStop.getQueueSize());
    }

}
