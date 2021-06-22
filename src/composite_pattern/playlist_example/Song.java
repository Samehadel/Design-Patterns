package composite_pattern.playlist_example;

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
