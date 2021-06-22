package facade_pattern.main;

import facade_pattern.car.units.EngineUnit;

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
