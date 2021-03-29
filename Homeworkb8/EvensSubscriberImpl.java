package HW8;

public class EvensSubscriberImpl implements SubscriberInterface{
    private int eventsReceived = 0;
    private int threshold = 14;
    private PublisherImpl publisherImpl = new PublisherImpl();

    public boolean notifySubscriber(Event theEvent) {
        if(theEvent.getEventDataValue()%2 == 0) {
            eventsReceived = eventsReceived + 1;
            if(eventsReceived >= threshold ) {
                System.out.println("Even threshold reached: " + threshold);
                publisherImpl.unregisterSubscriber(this);
                return false;
            }
            if(eventsReceived <= threshold) {
                System.out.println("SubscriberEvens: HW8.Event is even: " + theEvent.getEventDataValue());
                return true;
            }
        }
        return true;
    }

    public void setEventsReceived(int eventsReceived1) {
        this.eventsReceived = eventsReceived1;
    }

    public int getEventsReceived() {
        return eventsReceived;
    }

    public PublisherImpl getPublisherImpl() {
        return publisherImpl;
    }
}
