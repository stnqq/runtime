package eleven.MiddleAgesGame;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        Forest forest = new Forest(hares, "Лето");
        // создайте объект "летний лес с зайцами"

        System.out.println("Список зайцев:");
        forest.printHares();

        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        Forest.setSeason("Winter");

        System.out.println("Список зайцев:");
        forest.printHares();
    }
}