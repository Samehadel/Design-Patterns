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
public interface IStructure {
    public void enter();
    public void exit();
    public void location();
    public String getName();
}
