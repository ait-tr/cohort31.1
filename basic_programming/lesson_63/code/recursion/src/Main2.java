public class Main2 {
  public static void main(String[] args) {
    recursivePrint(2);
  }
  public static void recursivePrint(int number) {
    if (number == 0) { // базовый случай - условие выхода
      System.out.println(0);
      return;
    }
    System.out.println(number);
    recursivePrint(number - 1); // number - 1 - шаг рекурсии
  }
//    Порядок чтения кода
//  3.recursivePrint(2);
//  5. number = 2
//  6. (2 == 0) == false
//  10. sout number, который равен в этом scope(область видимости) 2
//  11. recursivePrint(1)
//      открывается новый скоп
//      5. number = 1
//      6. 1 == 0  false
//      10. sout number, который равен в этом scope(область видимости) 1
//      11. recursivePrint(0)
//          5. number = 0;
//          6. 0 == 0 true и это наш базовый случай
//          7. распечатали намбер равный нулю
//          8. return - выпадаем из этого вызова recursivePrint(0)
//          программа дошла до конца


}