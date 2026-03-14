package Nine;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(10000);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " тг.");
        bankAccount.withdrawAll();
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " тг.");
    }
}