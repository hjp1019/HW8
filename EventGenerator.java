package hw8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EventGenerator {
	private List<SubscriberInterface> myList = new ArrayList<SubscriberInterface>();
	
	// constructor
	public EventGenerator(List<SubscriberInterface> myList) {
		for (SubscriberInterface s : myList) {
			this.myList.add(s);
		}
	}
	
	public void runSimulation(PublisherImpl pub) {
		for (int i=0; i<200; i++) {
			Event currEvent = generateEvent(i, ThreadLocalRandom.current().nextInt());
			System.out.println("Current event sequence number: " + currEvent.getEventSeqnum());
			System.out.println("Current event data value: " + currEvent.getEventDataValue());
			pub.notifySubscribers(currEvent);
			if (currEvent.getEventSeqnum() != 0 && currEvent.getEventSeqnum() % 40 == 0) {
				for (SubscriberInterface s : this.myList) {
					if (!(pub.getSubscribers().contains(s))) {
						pub.registerSubscriber(s);
					}
				}
			}
		}
	}
	
	// return type not specified in UML diagram
	private Event generateEvent(int seqNum, int data) {
		Event e = new Event(seqNum, data);
		return e;
	}
}
