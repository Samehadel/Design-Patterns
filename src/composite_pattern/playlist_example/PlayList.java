/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern1;

import java.util.ArrayList;

/**
 *
 * @author ALKODS
 */
public class PlayList implements IComponent{
    
    private String playlistName;
    private ArrayList<IComponent> songs; 

    public PlayList(String playlistName) {
        this.playlistName = playlistName;
        songs = new ArrayList<>();
    }
    
    public int addSong(IComponent component){
        songs.add(component);
        
        return songs.size() - 1;
    }
    
    @Override
    public void play() {
        System.out.println("Starting Playlist `" + this.playlistName + "`");
        for(IComponent song: songs)
            song.play();
        
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for(IComponent song: songs)
            song.setPlaybackSpeed(speed);
    }

    @Override
    public String getName() {
        return this.playlistName;
    }
    
}
