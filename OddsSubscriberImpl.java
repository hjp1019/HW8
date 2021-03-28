package hw8;

public class OddsSubscriberImpl implements SubscriberInterface {
	private int eventsReceived;
	private int threshold;
	private PublisherImpl publisherImpl;
	
	public OddsSubscriberImpl(int threshold) {
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
		
		// if not divisible by 2 it is odd
		if (!(e.getEventDataValue() % 2 == 0)) {
			eventsReceived++;
			if (eventsReceived <= threshold) {
				System.out.println("SubscriberOdds: Event is odd: " + e.getEventDataValue());
			}
			if (eventsReceived == threshold) {
				return false;
			}
		}
		return true;
	}
}
