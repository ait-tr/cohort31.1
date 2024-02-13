public class Main {
  public static void main(String[] args) {
//    recursivePrint(3);
//    recursivePrintVer2(3);
    System.out.println("**");
    recursivePrintVer2(2);
//
  }

  //  печатает числа от указанного числа до нуля
  public static void recursivePrint(int number) {
    if (number == 0) { // базовый случай - условие выхода
      System.out.println(0);
      return;
    }
    System.out.println(number);
    recursivePrint(number - 1); // number - 1 - шаг рекурсии
  }
  public static void recursivePrintVer2(int number) {
    if(number > 0){
      recursivePrintVer2(number - 1); // number - 1 - шаг рекурсии
      System.out.println(number);
    } else { // базовый случай - условие выхода
      System.out.println(0);
      return;
    }
  }
//  Порядок чтения кода
//  recursivePrintVer2(2)
//  19. number = 2;
//  20. 2 > 0 == true
//  21. recursivePrintVer2(1);
//      19. number = 1
//      20. 1 > 0 == true
//      21. recursivePrintVer2(0)
//          19. number = 0
//          20. 0 > 0 == false
//          24. sout number = 0
//      22. sout number = 1
//  22. sout number = 2

}