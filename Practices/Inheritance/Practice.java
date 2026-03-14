package Practices.Inheritance;

public class Practice {
    public static void main(String[] args) {
        Fox foxAlica = new Fox();
        System.out.println("Это лиса Алиса");
        System.out.println("Цвет - " + foxAlica.color);
        System.out.println("Вес - " + foxAlica.weight);
        System.out.println("Она дикая - " + foxAlica.isWild);
        System.out.println("Хищник - " + foxAlica.isPredator);
        System.out.println("Она умеет говорить - " + foxAlica.say());
        System.out.println("И может зарычать " + foxAlica.growl());
    }
}
