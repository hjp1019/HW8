package ObserverPattern;

public class ObserverController {

	public static void main(String[] args) {
		PublisherImpl p = new PublisherImpl();
		SubscriberInterface s = new ListenForEvent1();
		
		p.addSubscriber(s);
		
		MyEvent thing = new MyEvent("Cat in the Hat", "thing1&2");
		
		p.notifyAll(thing);

	}

}
