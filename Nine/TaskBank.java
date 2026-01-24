package Nine;

public class TaskBank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setMoneyAmount(2000);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " тг.");

        bankAccount.withdrawAll();
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " тг.");
    }
}

class BankAccount {
    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    private long moneyAmount;

    public void withdrawAll() {
        System.out.println("Со счета снято " + moneyAmount + " тг. ");
        moneyAmount = 0;
    }
    // допишите код методов

    // используйте параметр newMoneyAmount для установки нового значения
}
