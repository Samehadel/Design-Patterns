/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.pattern;

/**
 *
 * @author ALKODS
 */
public class Bus implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Starting Engine for Bus...");
    }
    
}
