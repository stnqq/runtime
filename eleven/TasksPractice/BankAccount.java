package eleven.TasksPractice;

public class BankAccount {
    String owner;
    double balance;
    static int totalAccounts;

public BankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;

    accountCountIncrease();
}

    public void accountCountIncrease(){
        totalAccounts++;
    }

    public static void printTotalAccounts(){
        System.out.println("Всего аккаунтов: " + totalAccounts);
    }
}
