public class Human extends Thread{
  private final CreditCard creditCard; // кредитка человека
  private String name;                 // имя человека

  public Human(String name, CreditCard creditCard) {
    this.creditCard = creditCard;
    this.name = name;
  }

  @Override
  public void run(){
//    человек идет делать покупки - 100 покупок (насколько хватит денег)
    for (int i = 0; i < 100; i++){
//      проверим есть ли на счету деньги?
      synchronized (creditCard) {
        System.out.println(name + " проверяет баланс, есть ли деньги?");
        if (creditCard.getAmount() >= 10) {
          System.out.println("Иду покупать");
          if (creditCard.buy(10)) {
            System.out.println(name + " купил");
          } else {
            System.out.println(name + " Это что вообще было");
          }
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        } else {
          System.out.println("Деньги кончились");
          return;
        }
      }
    }
  }
}
