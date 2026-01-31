package Practices;

import src.Converter;
import src.MonthData;
import src.StepTracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Converter converter = new Converter();
        MonthData monthData = new MonthData();
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            int option = scanner.nextInt();
            if (option == 1) {
                monthData.printDayAndStepsFromMonth();
            } else if (option == 2) {
                stepTracker.changeStepGoal();
            } else if (option == 3) {
                stepTracker.printStatistics();
            } else if (option == 4) {
                System.out.println("Производится выход из приложения!");
                break;
            } else {
                System.out.println("Такой команды нет!\n" + "Попробуйте ввести другую команду.");
            }
        }
    }

    static void printMenu() {
        System.out.println("""
                1. Ввести количество шагов за определённый день
                2. Изменить цель по количеству шагов в день
                3. Напечатать статистику за определённый месяц;
                4. Выйти из приложения.
                """);
    }
}
