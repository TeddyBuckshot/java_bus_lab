import java.util.ArrayList;
public class BusStop{

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int getQueueSize(){
        return this.queue.size();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public Person removePersonFromQueue(){
        Person person = null;
        if (this.getQueueSize() > 0) {
            person = this.queue.remove(0);
        }
        return person;
    }
}
