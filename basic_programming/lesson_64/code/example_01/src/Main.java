public class Main {
  public static void main(String[] args){
//    Что было раньше курица или яйцо?
//  rooster - петушок, hen - курочка, chick - цыпленок,
//  chicken - курятина
    HenThread henThread = new HenThread();
    EggThread eggThread = new EggThread();
//  Как запустить поток? // start()
    henThread.start();
    eggThread.start();
//  непредсказуемо, недетерминированно

  }
}