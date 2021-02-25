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
public class VehicleFactory {
    
    public static Vehicle getVehicle(VehicleType vType){
        return vType.getVehicle();
    }
}
