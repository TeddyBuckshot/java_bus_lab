import java.util.ArrayList;
import java.util.Queue;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }else{
            System.out.println("sorry, the bus is full!");
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUp(BusStop bus_stop){
        if (this.passengerCount() < this.capacity && bus_stop.getQueueSize() > 0) {
            Person person = bus_stop.removePersonFromQueue();
            this.addPassenger(person);
        }
    }
}
