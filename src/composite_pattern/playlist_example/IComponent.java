/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern1;

/**
 *
 * @author ALKODS
 */
public interface IComponent {
    public void play();
    public void setPlaybackSpeed(float speed);
    public String getName();
}
