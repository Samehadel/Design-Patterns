/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car.units;

/**
 *
 * @author ALKODS
 */
public class EngineUnit {
    public ElectricUnit electricUnit; 
    
    public GasUnit gasUnit; 

    public EngineUnit() {
        this.electricUnit = new ElectricUnit();
        this.gasUnit = new GasUnit();
    }
    
    
}
