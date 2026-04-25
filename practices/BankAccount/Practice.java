package practices.BankAccount;

public class Practice {
    public static void main(String[] args) {
        Account account = new Account("Aibar", 2000);
        Transaction transaction = new Transaction(account, 3000);
        Transaction transaction1 = new Transaction(account, -1500);
        System.out.println(transaction);
        System.out.println(transaction1);
    }
}
