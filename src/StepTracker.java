package src;

import java.util.Scanner;

public class StepTracker {
    int goalByStepsPerDay = 10000;
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Введите корректное значение(от 1 до 12).");
            return;
        }
        System.out.println("Введите номер дня: ");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Введите корректное значение(от 1 до 30 включительно).");
            return;

        }
        System.out.println("Введите количество шагов: ");
        int steps = scanner.nextInt();

        if (steps <= 0) {
            System.out.println("Введите корректное значение (Оно должно быть больше нуля).");
            return;
        }
//        steps v massive "days" objecta MonthData
        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;

    }

    public void changeStepGoal() {
        System.out.println("Введите новую цель шагов в день: ");
        int goalStepPerDay = scanner.nextInt();

        if (goalStepPerDay <= 0) {
            System.out.println("Введите корректное значение(Больше нуля.)");
            return;
        }
        goalByStepsPerDay = goalStepPerDay;
    }

    public void printStatistics() {
        System.out.println("Введите месяц за который вы хотите получить статистику");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка: месяц должен быть от 1 до 12.");
            return;
        }
        MonthData monthData = monthToData[monthNumber - 1];

        int steps = monthData.sumStepsFromMonth();

        monthData.printDayAndStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: " + steps);

// максимальное пройденное количество шагов в месяце;
        int max = monthData.maxStepsForMonth();
        System.out.println("Максимальное количество шагов за день: " + max);

// среднее количество шагов;
        int average = monthData.averageStepsForMonth();
        System.out.println("Среднее количество шагов: " + average);

// пройденная дистанция (в км);
        int km = converter.convertToKm(steps);
        System.out.println("Пройденная дистанция (км): " + km);

// количество сожжённых килокалорий;
        int kilocalories = converter.convertStepsToKilocalories(steps);
        System.out.println("Сожжено килокалорий: " + kilocalories);

// лучшая серия: максимальное количество подряд идущих дней, >= цели
        int bestSeries = monthData.bestSeries(goalByStepsPerDay);
        System.out.println("Лучшая серия: " + bestSeries);
    }
}
