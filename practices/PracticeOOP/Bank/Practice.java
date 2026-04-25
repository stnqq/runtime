package practices.PracticeOOP.Bank;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вы хотите положить на счет?");
        long money = scanner.nextLong();
        bank.setMoney(money);
        System.out.println("На вашем счету " + bank.getMoney() + " тенге.");
        System.out.println("Комиссия составила " + bank.getCommission() + " тенге.");
    }
}
