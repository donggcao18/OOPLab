package hust.soict.globalict.aims.media;
import java.util.Objects;

public class Track implements Playable {

    private final String title;
    private final int length;   // seconds

    public Track(String title, int length) {
        this.title  = title;
        this.length = length;
    }

    public String getTitle()  { return title; }
    public int    getLength() { return length; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Track)) return false;
        Track other = (Track) obj;
        return length == other.length &&
                Objects.equals(title, other.title);
    }

    @Override
    public void play() {
        if (length <= 0) {
            System.out.println("ERROR: Track '" + title +
                    "' cannot be played");
            return;
        }
        System.out.println("Playing track: " + title);
        System.out.println("Track length: " + length + " seconds");
    }

}