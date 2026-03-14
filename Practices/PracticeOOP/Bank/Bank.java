package Practices.PracticeOOP.Bank;

public class Bank {
    public long money = 0;
    private int commission = 500;

    public long getMoney() {
        return money;
    }

    private boolean isOfficial = false; // является ли банк государственным

    public boolean isOfficial() { // метод называется так же, как переменная
        return isOfficial;
    }


    public void setMoney(long newMoneyAmount) {
        calculateCommission(newMoneyAmount);
        if (newMoneyAmount > 0 && newMoneyAmount > commission) {
            money = newMoneyAmount - commission;
        } else {
            commission = 0;
            System.out.println("Минимальная сумма - 251 тенге.");
        }
    }

    public int getCommission() {
        return commission;
    }

    private void calculateCommission(long newMoneyAmount) {
        if (newMoneyAmount < 25000) {
            commission = 250;
        } else {
            commission = 500;
        }
    }

}
