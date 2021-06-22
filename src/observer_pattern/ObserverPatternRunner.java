package observer_pattern;

import observer_pattern.observers.HomeTownAgency;
import observer_pattern.observers.Observer;
import observer_pattern.subject.NewsAgency;
import observer_pattern.subject.Subject;

public class ObserverPatternRunner {

    public static void main (String [] args){
        Observer o1 = new HomeTownAgency();
        Observer o2 = new HomeTownAgency();
        Observer o3 = new HomeTownAgency();

        Subject s1 = new NewsAgency();

        o1.setSubject(s1);
        o2.setSubject(s1);
        o3.setSubject(s1);

        s1.registerObserver(o1);
        s1.registerObserver(o2);
        s1.registerObserver(o3);

        s1.setState("State 1");
        s1.setState("State 2");

        s1.unregisterObserver(o3);

        s1.setState("State 3");
    }
}
