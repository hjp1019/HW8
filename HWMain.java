package hw8;

public class HWMain {

	public static void main(String[] args) {
		PublisherImpl pub = new PublisherImpl();
		OddsSubscriberImpl odds = new OddsSubscriberImpl(1);
		EvensSubscriberImpl evens = new EvensSubscriberImpl(1);
		ThreesSubscriberImpl threes = new ThreesSubscriberImpl(1);
		pub.registerSubscriber(odds);
		pub.registerSubscriber(evens);
		pub.registerSubscriber(threes);
		EventGenerator eventGen = new EventGenerator(pub.getSubscribers());
		eventGen.runSimulation(pub);
	}

}
