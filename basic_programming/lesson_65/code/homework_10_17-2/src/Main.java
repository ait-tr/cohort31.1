public class Main {
  public static void main(String[] args) {
//    Создайте два потока: Ахилес (AchillesThread) и черепаха(TortoiseThread).
//        Пусть в потоке Ахилес выводится фраза "I run fast"
//        с интервалом полсекунды 30 раз.
//        Пусть в потоке черепахи выводится фраза
//        "I just run" c интервалом две секунды 12 раз.
//        **После** того как эти потоки завершат работу выведите в консоль фразу
//        - "Achilles can never overtake the tortoise?"
    AchillesThread achillesThread = new AchillesThread();
    Thread tortoiseThread = new Thread(){
      @Override
      public void run(){
        for(int i = 0; i< 12; i++){
          try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          System.out.println("I just run");
        }
      }
    };
    achillesThread.start();
    tortoiseThread.start();
//    turtle - морская черепаха, tortoise - сухопутная
    try {
      achillesThread.join();
      tortoiseThread.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Achilles can never overtake the tortoise?");
  }
}