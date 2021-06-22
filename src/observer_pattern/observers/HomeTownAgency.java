package observer_pattern.observers;

public class HomeTownAgency extends Observer{

    @Override
    public void update(Object o) {
        System.out.println(this.toString() + " News: " + (String) o);
    }
}
