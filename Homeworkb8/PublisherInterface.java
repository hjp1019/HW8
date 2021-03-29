package ObserverPattern;

public interface PublisherInterface {
	
	public void addSubscriber(SubscriberInterface s);
	public void removeSubscriber(SubscriberInterface s);
	public void registerSubscriber(SubscriberInterface s);	
	public void notifyAll(MyEvent e);

}
