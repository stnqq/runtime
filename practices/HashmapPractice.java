package practices;

import java.util.HashMap;

public class HashmapPractice {
    public static void main(String[] args) {
//        HashMap<String, String> capitals = new HashMap<>();
//        capitals.put("Канада", "Торонто");
//        capitals.put("Ирак", "Багдад");
//        capitals.put("Австрия", "Вена");
//        System.out.println(capitals);
//        capitals.put("Канада", "Оттава");
//        System.out.println(" ");
//        System.out.println(capitals);

//        HashMap<String, ArrayList<Double>> menu = new HashMap<>(); //создаём хеш-таблицу
//        ArrayList<Double> mojitoPrice = new ArrayList<>(); //создаём список с ценами для коктейля
//        mojitoPrice.add(7000.0); //добавляем в список цену в тенге
//        mojitoPrice.add(15.50); //добавляем в список цену в долларах
//        mojitoPrice.add(13.20); //добавляем в список цену в евро
//        menu.put("Коктейль Mojito", mojitoPrice); //добавляем коктейль и список ценами в хеш-таблицу
//        ArrayList<Double> tiramisuPrice = new ArrayList<>(); //создаём список с ценами для тирамису
//        tiramisuPrice.add(1800.0);
//        tiramisuPrice.add(4.00);
//        tiramisuPrice.add(3.20);
//        menu.put("Тирамису", tiramisuPrice); //добавляем тирамису и список с ценами в хеш-таблицу
//        ArrayList<Double> ramenPrice = new ArrayList<>(); //создаём список с ценами для рамена
//        ramenPrice.add(4000.0);
//        ramenPrice.add(8.50);
//        ramenPrice.add(7.00);
//        menu.put("Рамен", ramenPrice); //добавляем рамен и список с ценами в хеш-таблицу
//        System.out.println(menu);

//        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
//        ArrayList<Integer> januaryHolidays = new ArrayList<>();
//        januaryHolidays.add(1);
//        januaryHolidays.add(7);
//        stateHolidays.put("january", januaryHolidays);
//
//        ArrayList<Integer> februaryHolidays = new ArrayList<>();
//        februaryHolidays.add(14);
//        februaryHolidays.add(18);
//        stateHolidays.put("february", februaryHolidays);
//        System.out.println(stateHolidays);

//        HashMap<String, String> officeTool = new HashMap<>();
//        officeTool.put("S234", "Большой степлер");
//        officeTool.put("P342", "Чёрно-белый принтер");
//        officeTool.put("N845", "Острые ножницы");
//
//        String tool = officeTool.get("N845");
//        System.out.println(tool); // Получили "Острые ножницы"

//        HashMap<String, String> countriesCapitals = new HashMap<>();
//        countriesCapitals.put("Франция", "Париж");
//        countriesCapitals.put("Аргентина", "Буэнос-Айрес");
//        countriesCapitals.put("Россия", "Москва");
//        countriesCapitals.put("Америка", "Вашингтон");
//        countriesCapitals.put("Япония", "Токио");
//        countriesCapitals.put("Норвегия", "Осло");
//
//        System.out.println("Столица Аргентины: " + countriesCapitals.get("Аргентина"));
//        System.out.println("Столица Норвегии: " + countriesCapitals.get("Норвегия"));

//        HashMap<String, ArrayList<Integer>> orders = new HashMap<>();
//        ArrayList<Integer> ordersNum = new ArrayList<>(); // Создаём новый список
//        ordersNum.add(1);
//        ordersNum.add(5);
//        ordersNum.add(6);
//        orders.put("Иван И.", ordersNum); // Добавили имя клиента и список его заказов
// /* Для нового клиента новый список.
// Можно не создавать ещё одну переменную, а переиспользовать имеющуюся.*/
//        ordersNum = new ArrayList<>();
//        ordersNum.add(2);
//        ordersNum.add(4);
//        ordersNum.add(3);
//        orders.put("Ольга С.", ordersNum);
//        // Заводим переменную для списка заказов конкретного клиента
//        ArrayList<Integer> customerOrders = orders.get("Костя Д.");
//        // Печатаем номера заказов конкретного клиента
//        for (int orderNum : customerOrders) {
//            System.out.println("Заказ № " + orderNum);
//        }

//        HashMap<String, String> officeTool = new HashMap<>();
//        officeTool.put("Microsoft", "Microsoft");
//        officeTool.put("Microsoft", "Microsoft");
//        officeTool.put("N845", "Острые ножницы");
//
//        for (String tool : officeTool.values()) {
//            if (tool.equals("Острые ножницы")) {
//                System.out.println(tool);
//            }
//        }

        HashMap<String, Double> orders = new HashMap<>();
        orders.put("Алишер Д.", 4345.5);
        orders.put("Дамир С.", 76564.43);
        orders.put("Александр Т.", 1234.86);
        orders.put("Айгуль А.", 23432.87);
        orders.put("Санжар Б.", 1034753.6);
        orders.put("Алина В.", 450.0);

        double totalAmount = 0; // Объявите переменную, где будет сохранена общая сумма
        for (double amount : orders.values()) { // Пройдитесь в цикле по значениям
            totalAmount += amount;
        }

        System.out.println("Всего было совершено заказов на сумму: " + totalAmount);
    }
}
