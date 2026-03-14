package Eleven.TasksPractice;

import Practices.PracticeOOP.Bank.Bank;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Данил", 1000);
        BankAccount acc2 = new BankAccount("Not Danil", 100000);

        BankAccount.printTotalAccounts();
    }
}
