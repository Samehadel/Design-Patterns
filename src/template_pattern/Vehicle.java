/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.pattern;

/**
 *
 * @author ALKODS
 */
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
