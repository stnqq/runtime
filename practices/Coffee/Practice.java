package practices.Coffee;

class Coffee {
    protected double espresso;
    protected double milk;
    public Coffee() {
        espresso = 50.0;
        milk = 250.0;
    }
    public double mixAndGetVolume() {
        return espresso + milk;
    }
}
class Cappuccino extends Coffee {
    public double mixAndGetVolume() { // переопределили метод mixAndGetVolume()
        double milkFoam = milk / 2;
        return espresso + milkFoam + milk / 3;
    }
}
public class Practice {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino();
        System.out.println("Объём капучино - " + cappuccino.mixAndGetVolume());
    }
}