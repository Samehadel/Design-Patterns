package factory_pattern.factory;


import factory_pattern.vehicle.Bus;
import factory_pattern.vehicle.Car;
import factory_pattern.vehicle.Truck;
import factory_pattern.vehicle.Vehicle;

public enum VehicleType {
    CAR {
        @Override
        Vehicle getVehicle() {
            return new Car();
        }
    }, BUS {
        @Override
        Vehicle getVehicle() {
            return new Bus();
        }
    }, TRUCK {
        @Override
        Vehicle getVehicle() {
            return new Truck();
        }
    };
    
    abstract Vehicle getVehicle();
}
