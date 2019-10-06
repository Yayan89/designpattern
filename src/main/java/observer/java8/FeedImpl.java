package observer.java8;

import java.util.ArrayList;
import java.util.List;

class FeedImpl implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void notifyObservers(String tweet) {
        observers.forEach(o -> o.notifySubject(tweet));
    }
}