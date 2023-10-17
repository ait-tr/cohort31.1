public class AchillesThread extends Thread{
  @Override
  public void run(){
    for(int i = 0; i< 30; i++){
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("I run fast");
    }
  }
}
