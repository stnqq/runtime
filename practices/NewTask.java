package practices;

import java.util.ArrayList;

public class NewTask {
    public static void main(String[] args) {

        ArrayList<Integer> speeds = new ArrayList<>(); // Объявите список
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (Integer speed : speeds) {
            sum += speed;  // Сложите все значения в списке
        }

        int averageSpeed = sum / speeds.size(); // Вычислите среднюю скорость
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");
    }
}