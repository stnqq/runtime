package nine;

class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public void withdrawAll() {
        System.out.println("Со счета снято " + moneyAmount + " тг. ");
        moneyAmount = 0;
    }
    // допишите код методов

    // используйте параметр newMoneyAmount для установки нового значения
}
