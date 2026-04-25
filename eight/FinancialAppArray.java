package eight;

import java.util.Scanner;
import java.util.ArrayList;


public class FinancialAppArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(444.06, 489.32, 3.14);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " KZT");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                // Номер дня больше не нужен. Уберите вопрос и считывание номера дня
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                // Сигнатура метода изменится, учитывайте это
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, day);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("Самая большая сумма расходов составила " + expensesManager.findMaxExpense() + " тенге.");
            } else if (command == 6) {
                expensesManager.removeAllExpenses();
            } else if (command == 7) {
                System.out.println("Введите сумму, которую желаете удалить");
                int expense = scanner.nextInt();
                expensesManager.removeExpense(expense);
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты");
        System.out.println("5 - Показать самую большую сумму расходов");
        System.out.println("6 - Очистить список трат");
        System.out.println("7 - Найти и удалить трату");
        System.out.println("0 - Выход");
    }
}


class Converter {
    double rateUSD;
    double rateEUR;
    double rateJPY;

    Converter(double usd, double eur, double jpy) {
        rateUSD = usd;
        rateEUR = eur;
        rateJPY = jpy;
    }

    void convert(double tenges, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + tenges / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + tenges / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + tenges / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}

class DinnerAdvisor {
    void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 15_000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 50_000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }
        } else if (moneyBeforeSalary < 150_000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
            } else {
                System.out.println("Окей, пора в Макдак!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Отлично! Заказывайте крабов!");
            } else {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
            }
        }
    }
}


class ExpensesManager {
    ArrayList<Double> expenses; // Замените массив списком

    ExpensesManager() {
        expenses = new ArrayList<>(); // Создайте список в конструкторе
    }

    // Номер дня больше не нужен
    double saveExpense(double moneyBeforeSalary, double expense, int day) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в тенге: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 5000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " тенге");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double expense : expenses) { // Используйте сокращённую форму цикла
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expenses.clear();
        System.out.println("Список трат пуст.");
    }

    void removeExpense(double expense) {
        if (expenses.contains(expense)) {
            System.out.println("Трата удалена!");
        } else {
            System.out.println("Такой траты нет.");
        }
    }
}
