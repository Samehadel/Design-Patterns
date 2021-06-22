package composite_pattern.playlist_example;

/**
 *
 * @author ALKODS
 */
public interface IComponent {
    public void play();
    public void setPlaybackSpeed(float speed);
    public String getName();
}
