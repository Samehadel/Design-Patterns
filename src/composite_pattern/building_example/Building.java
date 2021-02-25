/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern;

import java.util.ArrayList;

/**
 *
 * @author ALKODS
 */
public class Building implements IStructure{

    private ArrayList<IStructure> houses; 
    private String address; 
    private int buildingNumber; 
    private String name;
    
    public Building(String address, int buildingNumber, String name){
        this.address = address;
        this.buildingNumber = buildingNumber; 
        this.name = name;
        houses = new ArrayList<>();
    }
    
    public int addHouse(IStructure component){
        houses.add(component);
        
        return houses.size() - 1 ;
    }
    public IStructure getHouse(int componentNumber){
        return houses.get(componentNumber);
    }
    
    @Override
    public void enter() {
        System.out.println("Enter Building Number " + this.buildingNumber);
    }

    @Override
    public void exit() {
        System.out.println("Exit Building Number " + this.buildingNumber);
    }

    @Override
    public void location() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return name;
    }
    
}
