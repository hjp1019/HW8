package hw8;

public interface PublisherInterface {
	public void notifySubscribers(Event e);
	public void registerSubscriber(SubscriberInterface s);
	public void unregisterSubscriber(SubscriberInterface s);
}
