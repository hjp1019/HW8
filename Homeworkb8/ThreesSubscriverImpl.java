package HW8;

public class ThreesSubscriverImpl implements SubscriberInterface{
    private int eventsReceived;
    private int threshold;
    private PublisherImpl publisherImpl = new PublisherImpl();

    public ThreesSubscriverImpl() {
        eventsReceived = 0;
        threshold = 14;
    }

    public boolean notifySubscriber(Event theEvent) {
        if(theEvent.getEventDataValue()%3 == 0) {
            eventsReceived = eventsReceived + 1;
            if(eventsReceived <= threshold) {
                System.out.println("SubscriberThrees HW8.Event is divisible by 3: " + theEvent.getEventDataValue());

            }
            if(eventsReceived >= threshold) {
                System.out.println("Threes threshold reached: " + threshold);
                publisherImpl.unregisterSubscriber(this);
                return false;
            }
        }
       return true;
    }

    }
