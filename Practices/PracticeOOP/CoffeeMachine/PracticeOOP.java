package Practices.PracticeOOP.CoffeeMachine;

public class PracticeOOP {
    public static void main(String[] args) {
        // Есть кофемашина:
        CoffeeMachine coffee = new CoffeeMachine();

        //Пользователь заказывает капучино, внутри кофемашины что-то происходит, и она готовит капучино/
                System.out.println(coffee.getCappuccino());

        // Пользователь заказывает латте,внутри кофемашины что-то происходит, и она готовит латте/
                System.out.println(coffee.getLatte());
    }
}
