package HW8;
public class HWMain {
    public static void main(String[] args) {
        PublisherImpl publisher = new PublisherImpl();
        EventGenerator eventGenerator = new EventGenerator();
        OddsSubscriberImpl oddsSubscriber = new OddsSubscriberImpl();
        ThreesSubscriverImpl threesSubscriver = new ThreesSubscriverImpl();
        EvensSubscriberImpl evensSubscriber = new EvensSubscriberImpl();
        publisher.registerSubscriber(oddsSubscriber);
        publisher.registerSubscriber(threesSubscriver);
        publisher.registerSubscriber(evensSubscriber);

        eventGenerator.runSimulation(publisher);
