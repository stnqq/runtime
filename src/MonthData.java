package src;

public class MonthData {
    int[] days = new int[30];

    public void printDayAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i+1) + " день. Количество шагов - " + days[i]);
        }
    }

    public int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int day : days) {
            sumSteps += day;
        }
        System.out.print("Общая сумма шагов за месяц:");
        return sumSteps;
    }

    public int maxStepsForMonth() {
        int maxStepsCount = 0;
        int maxDay = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxStepsCount) {
                maxStepsCount = days[i];
                maxDay = i;
            }
        }
        System.out.print("Наибольшее количество шагов за месяц был в день - " + maxDay + "\n" + "Количество шагов составило: " + maxStepsCount);
        return maxStepsCount;
    }

    public int averageStepsForMonth() {
        int sumSteps = 0;
        for(int day : days) {
            sumSteps += day;
        }
        return sumSteps/days.length;
    }

    public int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries++;
                finalSeries = Math.max(finalSeries, currentSeries);
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
}

