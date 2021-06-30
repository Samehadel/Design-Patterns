package factory_pattern;


import factory_pattern.factory.VehicleFactory;
import factory_pattern.factory.VehicleType;
import factory_pattern.vehicle.Vehicle;

public class FactoryPatternRunner {

    public static void main(String[] args) {
        Vehicle myVehicle = VehicleFactory.getVehicle(VehicleType.CAR);
        
        myVehicle.startEngine();
    }
    
}
