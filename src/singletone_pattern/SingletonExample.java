/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_package;

/**
 *
 * @author ALKODS
 */
public class SingletonExample {
    private static SingletonExample obj;
    
    private SingletonExample(){}
    
    //Thread-safe
    public synchronized static SingletonExample getInstance(){
        if(obj == null)
            obj = new SingletonExample();
            
        return obj;
    }
}
