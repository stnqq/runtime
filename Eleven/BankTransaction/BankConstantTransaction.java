package Eleven.BankTransaction;

import java.util.Scanner;

public class BankConstantTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в тенге.");
        // считайте сумму перевода
        int amount = scanner.nextInt();

        boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " тг. успешно выполнен.");
    }

    public static class TransactionValidator {
        // объявите константы
        static final int MIN_AMOUNT = 100;
        static final int MAX_AMOUNT = 100000;

        public static int getMinAmount() {
            return MIN_AMOUNT;
        }

        public static int getMaxAmount() {
            return MAX_AMOUNT;
        }

        public static boolean isValidAmount(int price) {
            if (price < MIN_AMOUNT) {
                System.out.println("Минимальная сумма перевода: " + getMinAmount() + " тг. Попробуйте ещё раз!");
            } else if (price > MAX_AMOUNT) {
                System.out.println("Максимальная сумма перевода: " + getMaxAmount() + " тг. Попробуйте ещё раз!");
            }
            return true;
        }
    }
}
