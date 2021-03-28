package hw8;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements PublisherInterface {
	private List<SubscriberInterface> myList = new ArrayList<SubscriberInterface>();
	private List<SubscriberInterface> deleteLater = new ArrayList<SubscriberInterface>();
	
	// constructor
	public PublisherImpl() {
		
	}
	
	public List<SubscriberInterface> getSubscribers() {
		return this.myList;
	}
	
	public void notifySubscribers(Event e) {
		for (SubscriberInterface s : myList) {
			if (s.notifySubscriber(e) == false) {
				this.deleteLater.add(s);
			}
		}
		for (SubscriberInterface deleteThis : deleteLater) {
			unregisterSubscriber(deleteThis);
		}
	}
	
	public void registerSubscriber(SubscriberInterface s) {
		this.myList.add(s);
	}
	
	public void unregisterSubscriber(SubscriberInterface s) {
		this.myList.remove(s);
	}
}
