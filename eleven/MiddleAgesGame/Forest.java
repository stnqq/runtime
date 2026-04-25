package eleven.MiddleAgesGame;

import java.util.List;

public class Forest {
     private final List<MountainHare> hares;

    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        Forest.season = season;
    }

    // добавьте метод setSeason(String newSeason)
    public static void setSeason(String newSeason) {
        Forest.season = newSeason;
        if (newSeason.equals("Winter")) {
            MountainHare.color = "white";
        } else {
            MountainHare.color = "gray";
        }
    }
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()
    public void printHares() {
        for(MountainHare mountainHare : hares) {
            System.out.println(mountainHare);
        }
    }
}