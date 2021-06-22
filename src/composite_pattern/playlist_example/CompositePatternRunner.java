package composite_pattern.playlist_example;

/**
 *
 * @author ALKODS
 */
public class CompositePatternRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Playlist
        PlayList p1 = new PlayList("Motivation Songs");
        
        //Songs
        Song s1 = new Song("`Sky full of stars`", "Coldplay");
        Song s2 = new Song("`Birds`", "Imagine Dragons");
        Song s3 = new Song("`Miracles`", "Coldplay");
        
        //Add songs to playlist
        p1.addSong(s1);
        p1.addSong(s2);
        p1.addSong(s3);
        
        p1.play();
        
        System.out.println("\nChange Playback speed\n");
        
        p1.setPlaybackSpeed(1.25f);
        p1.play();
    }
    
}
