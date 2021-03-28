package hw8;

public interface SubscriberInterface {
	public boolean notifySubscriber(Event e);
	public int getEventsReceived();
	public void setEventsReceived(int num);
}
