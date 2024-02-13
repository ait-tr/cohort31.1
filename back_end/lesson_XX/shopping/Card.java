package shopping;

public class Card implements Money{
    @Override
    public String payMoney() {
        return "Transfer from bank account";
    }
}
