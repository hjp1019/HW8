package HW8;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.util.Random;

public class EventGenerator {
    //private List<SubscriberInterface> myList = new ArrayList<>();

    public EventGenerator() {}

    public void runSimulation(PublisherImpl publisher){
        Random random = new Random();
        for (int i = 0; i < 200; i++){
            System.out.println("Sequence Number: " + i);
            int data = random.nextInt(200);
            System.out.println("Data: " + data);
            Event theNewEvent = generateEvent(i, data);
            if (theNewEvent.getEventDataValue()%40 == 0) {
                System.out.println("Re-registering all subscribers");
                publisher.reregisterSubscribers();

            }
            publisher.notifySubscribers(theNewEvent);


        }
    }

    private Event generateEvent(int i, int data) {
        return new Event(i, data);
    }


}
