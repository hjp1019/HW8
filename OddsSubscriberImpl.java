package hw8;

public class OddsSubscriberImpl implements SubscriberInterface {
	private int eventsReceived;
	private int threshold;
	private PublisherImpl publisherImpl;
	
	// UML says void but interface is boolean return type
	public boolean notifySubscriber(Event e) {
		return true;
	}
}
