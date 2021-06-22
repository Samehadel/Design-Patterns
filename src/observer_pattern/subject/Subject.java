package observer_pattern.subject;

import observer_pattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    protected abstract void notifyObservers();
    public abstract void setState (Object o);
}
