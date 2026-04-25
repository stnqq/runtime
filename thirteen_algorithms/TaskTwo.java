package thirteen_algorithms;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        while (true) {
            if (!s.hasNextInt()) {
                System.out.println("Произошла ошибка, введите число!");
                s.next();
                continue;
            }

            int guess = s.nextInt();
            if (guess == target) {
                System.out.println("Вы угадали!");
                break;
            } else if (guess > target) {
                System.out.println("Меньше");
            } else {
                System.out.println("Больше!");
            }
        }
        s.close();
    }
}
