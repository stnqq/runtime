package Practices;

import java.util.Scanner;
import java.util.ArrayList;

public class ListHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("""
                    Выберите действие:
                    1. Добавить задачу
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход
                    """);
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.println("Введите задачу для планирования: ");
                tasks.add(scanner.nextLine());
            } else if (choice.equals("2")) {
                System.out.println("Список задач: ");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + " - " + tasks.get(i));
                }
            } else if (choice.equals("3")) {
                System.out.println("Введите номер задачи, который хотите удалить");
                int deleteIndex = scanner.nextInt();
                tasks.remove(deleteIndex - 1);
            } else if (choice.equals("0")) {
                System.out.println("Завершение программы.");
                break;
            }
        }
    }
}
