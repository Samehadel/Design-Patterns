/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.pattern;

import Car.units.EngineUnit;

/**
 *
 * @author ALKODS
 */
public class CarOperations {
    private EngineUnit engine; 

    public CarOperations() {
        engine = new EngineUnit();
    }
    
    
    public void turnEngineOn(){
        System.out.println("Turning Engine On...");
        engine.gasUnit.pushGas();
        engine.electricUnit.pushFlame();
    }
    
    public void turnEngineOff(){
        System.out.println("Turning Engine Off...");
        engine.gasUnit.stopPushingGas();
        engine.electricUnit.TurnFlameOff();
    }
    
}
