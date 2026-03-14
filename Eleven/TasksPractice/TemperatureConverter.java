package Eleven.TasksPractice;

public class TemperatureConverter {


    public static void celsiusToFahrenheit(double celsius) {
        double F = (celsius * 9 / 5) + 32;
        System.out.println("F = " + F);
    }

    public static void fahrenheitToCelsius(double fahrenheit) {
        double C = (fahrenheit - 32) * 5 / 9;
        System.out.println("C = " + C);
    }
}
