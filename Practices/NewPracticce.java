package Practices;

import java.util.ArrayList;

public class NewPracticce {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(0, 92.3);
        temperatures.add(1, 12.4);
        temperatures.add(2, 74.1);
        temperatures.add(3, 45.0);

        double max = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > max) {
                max = temperatures.get(i);
            }
        }
        System.out.println("Самая высокая температура: " + max + " °С.");
    }
}

