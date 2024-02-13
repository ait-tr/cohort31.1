package shopping;

public class Wallet {

    Money money;

    public Wallet() {
    }

    public Wallet(Money money) {
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public void makePurchase(){
        System.out.println("Purchase by: " + money.payMoney());
    }

}
