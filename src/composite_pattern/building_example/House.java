package composite_pattern.building_example;


import java.util.ArrayList;

public class House implements IStructure{

    private ArrayList<IStructure> structures;
    private String name;
    private int houseNumber; 
    private int floorNumber; 
    
    public House(int floorNumber, int houseNumber, String name){
        this.houseNumber = houseNumber;
        this.floorNumber = floorNumber;
        this.name = name;
        structures = new ArrayList<>();
    }
    
    public int addStructure(IStructure component){
        structures.add(component);
        return structures.size() - 1; 
    }
    
    public IStructure getStructure(int componentNumber){
        return structures.get(componentNumber);
    }
    
    @Override
    public void enter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void location() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
