package practices.BankAccount;

public class Transaction {
    double transactionAmount;

    public Transaction(Account account, double transactionAmount) {
        this.transactionAmount = transactionAmount;
        if (transactionAmount > 0) {
            account.balance = transactionAmount + account.balance;
            System.out.println("Ваш баланс сейчас равен: " + account.balance);
        }
        if (transactionAmount < 0) {
            account.balance = account.balance + transactionAmount;
            System.out.println("Ваш баланс сейчас равен: " + account.balance);
        }
    }
}
