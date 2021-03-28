package hw8;

import java.util.concurrent.ThreadLocalRandom;

public class JunitTesting {
	public boolean testEvensNotifySubscriber() {
		EvensSubscriberImpl evens = new EvensSubscriberImpl(3);
		int count = 0;
		for (int i=0; i<10; i++) {
			Event e = new Event(i, count);
			evens.notifySubscriber(e);
			count += 2;
		}
		Event e2 = new Event(50, 50);
		return evens.notifySubscriber(e2);
	}
	
	public int testEvensNotifySubscriber2() {
		EvensSubscriberImpl evens = new EvensSubscriberImpl(5);
		Event e = new Event(39, 500);
		evens.notifySubscriber(e);
		int result = evens.getEventsReceived();
		return result;
		
	}
	
	public boolean testEvensNotifySubscriber3() {
		EvensSubscriberImpl evens = new EvensSubscriberImpl(5);
		int count = 1;
		for (int i=1; i<11; i++) {
			Event e = new Event(i, count);
			evens.notifySubscriber(e);
			count += 2;
		}
		Event e2 = new Event(45, 49);
		return evens.notifySubscriber(e2);
	}
	
	public boolean testPublisherImplAddSubscriber() {
		PublisherImpl p = new PublisherImpl();
		EvensSubscriberImpl evens = new EvensSubscriberImpl(5);
		p.registerSubscriber(evens);
		if (p.getSubscribers().contains(evens)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean testPublisherImplRemoveSubscriber() {
		PublisherImpl p = new PublisherImpl();
		EvensSubscriberImpl evens = new EvensSubscriberImpl(5);
		p.registerSubscriber(evens);
		p.unregisterSubscriber(evens);
		if (p.getSubscribers().contains(evens)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean testPublisherImplNothifySubscriber() {
		PublisherImpl p = new PublisherImpl();
		EvensSubscriberImpl evens = new EvensSubscriberImpl(1);
		p.registerSubscriber(evens);
		Event e = new Event(39, 500);
		p.notifySubscribers(e);
		if (p.getSubscribers().contains(evens)) {
			return true;
		} else {
			return false;
		}
	}
}
