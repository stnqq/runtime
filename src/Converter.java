package src;

public class Converter {
    public int convertToKm(int steps) {
        // 1 step ~~ 0.75m
        return (steps * 75) / 100000;
    }

    public int convertStepsToKilocalories(int steps) {
        // 1 step ~~ 0.05kcal for step
        return (steps * 5) / 100;
    }
}