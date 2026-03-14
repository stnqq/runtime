package Practices.GeoLesson;

public class Teacher {
    int numberOfLessons; // число уроков
    int numberOfPupils; // число учеников
    String name; // имя учителя

    // конструктор класса-родителя
    public Teacher(int newNumberOfLessons,
                   int newNumberOfPupils,
                   String newName) {
        numberOfLessons = newNumberOfLessons;
        numberOfPupils = newNumberOfPupils;
        name = newName;
    }
}