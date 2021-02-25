/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern;

/**
 *
 * @author ALKODS
 */
public class Room implements IStructure{

    private String name; 
    private int x; 
    private int y;
    
    public Room(String name, int x, int y){
        this.name = name;
        this.x = x; 
        this.y = y;
    }
    
    @Override
    public void enter() {
        System.out.println("Entered room " + this.name);
    }

    @Override
    public void exit() {
        System.out.println("Exit room " + this.name);
    }

    @Override
    public void location() {
        System.out.println("Room Location is x = " + this.x + " and Y = " + this.y);
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
