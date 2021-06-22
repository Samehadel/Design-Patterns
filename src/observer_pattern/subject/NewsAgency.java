package observer_pattern.subject;

public class NewsAgency extends Subject{
    private String news;

    @Override
    public void notifyObservers() {
        this.observers.forEach(o-> o.update(news));
    }

    @Override
    public void setState(Object o) {
        this.news = (String) o;
        notifyObservers();
    }
}
