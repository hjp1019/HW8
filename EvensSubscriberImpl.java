package hw8;

public class EvensSubscriberImpl implements SubscriberInterface {
	private int eventsReceived;
	private int threshold;
	private PublisherImpl publisherImpl;
	
	// UML diagram says void here but in interface boolean
	public boolean notifySubscriber(Event e) {
		return true;
	}
}
