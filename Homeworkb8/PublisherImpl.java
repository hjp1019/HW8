package HW8;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements PublisherInterface{
    private static List<SubscriberInterface> myList = new ArrayList<>();
    private static List<SubscriberInterface> unList = new ArrayList<>();
    public boolean result = false;


    @Override
    public void notifySubscribers(Event theEvent) {
        //System.out.println(theEvent);
        for (int i = 0; i < myList.size(); i ++ ) {
            result =  myList.get(i).notifySubscriber(theEvent);
        }

    }

    @Override
    public void registerSubscriber(SubscriberInterface s){
        myList.add(s);

    }

    public void reregisterSubscribers() {
        int j = unList.size();
        for(int i = 0; i < j; i ++) {
            SubscriberInterface temp = unList.get(i);
            temp.setEventsReceived(0);
            myList.add(temp);

        }

        unList.removeAll(unList);




    }

    @Override
    public void unregisterSubscriber(SubscriberInterface s) {
        unList.add(s);
        myList.remove(s);
        s.setEventsReceived(0);
    }

    public PublisherImpl PublisherImpl(){
        return this;
    }

    public static List<SubscriberInterface> getMyList() {
        return myList;
    }
}
