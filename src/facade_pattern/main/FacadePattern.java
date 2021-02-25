/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.pattern;

/**
 *
 * @author ALKODS
 */
public class FacadePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Client
        CarOperations operations = new CarOperations();
        
        operations.turnEngineOn();
        
        
        operations.turnEngineOff();
    }
    
}
