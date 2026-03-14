package Eleven.Practice;

import java.util.ArrayList;

public class Song {
    final String artist;
    final String title;
    final String genre;

    public Song(String artist, String title, String genre) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        // инициализация переменных
    }

    public static void main(String[] args) {
        ArrayList<Song> goldenHitsCollection = new ArrayList<>();
        goldenHitsCollection.add(new Song("Цой", "Кукушка", "Рок" )); // добавление нового хита
    }
}