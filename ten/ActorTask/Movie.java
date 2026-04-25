package ten.ActorTask;

import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return Objects.equals(title, movie.title) &&
                Objects.equals(releaseYear, movie.releaseYear) &&
                Objects.equals(description(), movie.description());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear, description());
    }

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }
}