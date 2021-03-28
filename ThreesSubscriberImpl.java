package hw8;

public class ThreesSubscriberImpl implements SubscriberInterface {
	private int eventsReceived;
	private int threshold;
	private PublisherImpl publisherImpl;
	
	public ThreesSubscriberImpl(int threshold) {
		this.threshold = threshold;
	}
	
	public int getEventsReceived() {
		return this.eventsReceived;
	}
	
	public void setEventsReceived(int num) {
		this.eventsReceived = num;
	}
	
	// UML says void but interface is boolean return type
	public boolean notifySubscriber(Event e) {
		
		if (e.getEventDataValue() % 3 == 0) {
			eventsReceived++;
			if (eventsReceived <= threshold) {
				System.out.println("SubscriberThrees: Event is divisible by 3: " + e.getEventDataValue());
			}
			if (eventsReceived == threshold) {
				return false;
			}
		}
		return true;
	}
}
