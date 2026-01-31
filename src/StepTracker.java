package src;

import java.util.Scanner;

public class StepTracker {
    int goalByStepsPerDay = 10000;
    Scanner scanner = new Scanner(System.in);
    MonthData[] monthToData = new MonthData[12];

    public StepTracker() {
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
        if (day < 1 || day > 31) {
            System.out.println("Введите корректное значение(от 1 до 30 включительно).");
            return;

        }
        System.out.println("Введите количество шагов: ");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Введите корректное значение (Оно должно быть больше нуля).");
        }
//        steps v massive "days" objecta MonthData
        MonthData monthData = monthToData[month];
        monthData.days[day] += steps;

    }

    public void changeStepGoal() {
        int goalStepPerDay = scanner.nextInt();
        if (goalStepPerDay < 0 || goalStepPerDay == 0) {
            System.out.println("Введите корректное значение(Значения не должно быть меньше или равно нулю.)");
        }

    }

    public void printStatistics() {
        System.out.println("Введите месяц за который вы хотите получить статистику");
        int monthNumber = scanner.nextInt();
        MonthData monthData = monthToData[monthNumber];
        Converter converter = new Converter();

        int steps = monthData.days[monthNumber - 1];
//        количество пройденных шагов по дням;
        monthData.printDayAndStepsFromMonth();
//        общее количество шагов за месяц;
        monthData.sumStepsFromMonth();
//        максимальное пройденное количество шагов в месяце;
        monthData.maxStepsForMonth();
//        среднее количество шагов;
        monthData.averageStepsForMonth();
//        пройденная дистанция (в км);
        converter.convertToKm(steps);
//        количество сожжённых килокалорий;
        converter.convertStepsToKilocalories(steps);
//        лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
        monthData.bestSeries(goalByStepsPerDay);
    }
}
