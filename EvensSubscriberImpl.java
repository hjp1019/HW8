package hw8;

public class EvensSubscriberImpl implements SubscriberInterface {
	private int eventsReceived;
	private int threshold;
	private PublisherImpl publisherImpl;
	
	public EvensSubscriberImpl(int threshold) {
		this.threshold = threshold;
	}
	
	// UML diagram says void here but in interface boolean
	public boolean notifySubscriber(Event e) {
		
		if (e.getEventDataValue() % 2 == 0) {
			eventsReceived++;
			if (eventsReceived <= threshold) {
				System.out.println("SubscriberEvens: Event is even: " + e.getEventDataValue());
			}
			if (eventsReceived == threshold) {
				return false;
			}
		}
		return true;
	}
}
