package template_pattern;

public class Truck extends Vehicle {

    @Override
    protected void startEngine() {
        System.out.println("Truck: Starting Engine");
    }

    @Override
    protected void accelerate() {
        System.out.println("Truck: Accelerating");
    }

    @Override
    protected void steer() {
        System.out.println("Truck: Steering");
    }

    @Override
    protected void brake() {
        System.out.println("Truck: Braking");
    }
}
