package hw8;

public class ThreesSubscriberImpl implements SubscriberInterface {
	private int eventsReceived;
	private int threshold;
	private PublisherImpl publisherImpl;
	
	// UML says void but interface is boolean return type
	public boolean notifySubscriber(Event e) {
		return true;
	}
}
