package facade_pattern.car.units;

public class EngineUnit {
    public ElectricUnit electricUnit; 
    
    public GasUnit gasUnit; 

    public EngineUnit() {
        this.electricUnit = new ElectricUnit();
        this.gasUnit = new GasUnit();
    }
    
    
}
