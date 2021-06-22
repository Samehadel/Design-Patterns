package observer_pattern.observers;

import observer_pattern.subject.Subject;

public abstract class Observer {

    protected Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public abstract void update(Object o);

}
