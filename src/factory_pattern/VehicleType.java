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
