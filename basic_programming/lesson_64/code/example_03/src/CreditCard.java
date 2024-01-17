public class CreditCard {
  private int amount;

  public int getAmount() {
    return amount;
  }

  public CreditCard(int amount) {
    this.amount = amount;
  }

  public boolean buy(int cost){
    if(amount >= cost){
      amount -= cost; // если денег достаточно - покупаем
      return true;
    } else {
      System.out.println("Недостаточно денег!");
      return false;
    }
  }
}
