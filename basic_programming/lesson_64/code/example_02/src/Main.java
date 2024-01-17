public class Main {
  public static void main(String[] args) {
//    ad hoc
    Thread eggThread = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          System.out.println(
              Thread.currentThread().getName()
                  + " Egg");
        }
      }
    };
    Thread henThread = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          System.out.println(
              Thread.currentThread().getName()
                  + " Hen");
        }
      }
    };
    henThread.start();
    eggThread.start();
    try {
      henThread.join();
      eggThread.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Main sout");
  }
}