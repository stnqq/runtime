package Practices;

import java.util.ArrayList;

public class NewPractice {
    public static void main(String[] args) {
//        ArrayList<String> studentNames = new ArrayList<>();
//        studentNames.add("Sasha");
//        studentNames.add("Masha");
//        System.out.println(studentNames);

//        ArrayList<Double> expenses = new ArrayList<>();
//        expenses.add(3.0);
//        expenses.add("5.0 тенге");

        ArrayList<String> femaleNames = new ArrayList<>(); // Создайте список
        femaleNames.add("Нурсая");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add(1, "Айгерим"); // Добавьте имя "Айгерим"

        System.out.println("Сейчас в списке: " );
        for (String name : femaleNames) {
            System.out.println("Имя - " + name);
        }
    }
}

