package HW8;

public class OddsSubscriberImpl implements SubscriberInterface{
    private int eventsReceived = 0;
    private int threshold = 21;
    private PublisherImpl publisherImpl = new PublisherImpl();

    public boolean notifySubscriber(Event theEvent) {
        if(theEvent.getEventDataValue()%2 != 0) {
            eventsReceived = eventsReceived + 1;
            if(eventsReceived <= threshold) {
                System.out.println("SubscriberOdds: HW8.Event is odd: " + theEvent.getEventDataValue());

            }
            if(eventsReceived >= threshold) {
                System.out.println("Odd threshold reached: " + threshold);
                publisherImpl.unregisterSubscriber(this);
                return false;
            }
        }
        return true;
    }

    public void setEventsReceived(int eventsReceived) {
        this.eventsReceived = eventsReceived;
    }

    public PublisherImpl getPublisherImpl() {
        return publisherImpl;
    }
}
