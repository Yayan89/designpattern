package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber) {
        subs.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        subs.remove(subscriber);
    }

    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }

    private void notifySubscribers() {
        subs.forEach(Subscriber::update);
    }
}
