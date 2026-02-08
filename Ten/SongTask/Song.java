package Ten.SongTask;

import java.util.Objects;

public class Song {
    public String title;
    public String artist;
    public String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if(this.getClass() != obj.getClass())
            return false;
        Song otherSong = (Song) obj;
        return Objects.equals(title, otherSong.title) &&
                Objects.equals(artist, otherSong.artist) &&
                Objects.equals(songwriter, otherSong.songwriter);
    }
}
