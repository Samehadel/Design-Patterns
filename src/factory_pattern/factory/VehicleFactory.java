package factory_pattern.factory;

import factory_pattern.vehicle.Vehicle;

public class VehicleFactory {
    
    public static Vehicle getVehicle(VehicleType vType){
        return vType.getVehicle();
    }
}
