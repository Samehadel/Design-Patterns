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
public class Song implements IComponent{

    private String songName;
    private String artist;
    private float speed = 1.0f; 

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }
    
    
    @Override
    public void play() {
        System.out.println("Playing Song " + this.songName + " For artist: " + this.artist + " On speed: " + this.speed);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return this.songName;
    }
    
}
