package de.ait.wallet;

public class Wallet {
    Money money;

    int amount;

    public Wallet(Money money) {
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public void makePayment(){
        System.out.println("Make payment by ... " + money.payMoney());
    }
}
