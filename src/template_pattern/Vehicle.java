package template.pattern;

public abstract class Vehicle {
    
    public final void drive(){
        startEngine();
        accelerate();
        driving();
        steer();
        brake();
    }
    protected abstract void startEngine();
    protected abstract void accelerate();
    protected abstract void steer();
    protected abstract void brake();
    
    private void driving(){
        System.out.println("Driving");
    }
    
}
