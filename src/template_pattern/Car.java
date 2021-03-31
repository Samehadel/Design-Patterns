package template.pattern;


public class Car extends Vehicle {

    @Override
    protected void startEngine() {
        System.out.println("Car: Starting Engine");
    }

    @Override
    protected void accelerate() {
        System.out.println("Car: Accelerating");
    }

    @Override
    protected void steer() {
        System.out.println("Car: Steering");
    }

    @Override
    protected void brake() {
        System.out.println("Car: Braking");
    }

}
