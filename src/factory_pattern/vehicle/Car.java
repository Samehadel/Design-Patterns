package factory_pattern.vehicle;


public class Car implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Start Engine for CAR");
    }
    
}
