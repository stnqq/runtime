package Practices.Inheritance;

public class Animal {
        protected double weight; // вес животного
        protected int age; // возраст животного
        protected int heartRate; // количество ударов сердца в минуту
        protected boolean isWild; // является ли оно диким

        public Animal() {
            weight = 0.0;
            age = 0;
            heartRate = 100;
            isWild = true;
        }

        public String say() {
            return "Я животное!";
        }
    }

