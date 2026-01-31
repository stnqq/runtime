package src;

public class Converter {
    public int convertToKm(int steps) {
        // 1 step ~~ 0.75m
        int km = (steps * 75) / 100000;
        return km;
    }

    public int convertStepsToKilocalories(int steps) {
        // 1 step ~~ 0.05kcal for step
        int kcal = (steps * 5) / 100;
        return kcal;
    }
}