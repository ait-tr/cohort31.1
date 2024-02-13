public class Main {
  /*
  Задание 1
  Дано натуральное число n. Выведите все числа от 1 до n.
  Иными словами, метод должен принимать натуральное число
  и выводить числа от 1 до это числа.
  Например, для параметра 6 -> выведет 1 2 3 4 5 6

     Задание 2 рекурсия (супер опциональное)
     Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом.
     Выведите yes, если является и no - если не является.

     P.S. Палиндром - это слово, которое одинаково читается слева направо, например: око, потоп.
     */
  public static void main(String[] args) {

    recursiveCount(6);
// pip   - yes
// pp    - yes
// rip   - no
// apipa - yes
// aripa - no
// eppe  - yes
//    I.
//    palindrom("apipa");
//    palindrom("pip");
//    palindrom("i"); // - базовый случай - yes
//    II.
//    palindrom("pp")
//    palindrim("")  - базовый случай - yes
//    III.
//    palindrom("aripa");
//    palindrom("rip") - no
//    System.out.println("aripa".substring(1, 3));
    System.out.println(palindrom("pop"));   // yes
    System.out.println(palindrom("epope")); // yes
    System.out.println(palindrom("erope")); // no
    System.out.println(palindrom("e"));     // yes
    System.out.println(palindrom("dd"));    // yes
    System.out.println(palindrom("dr"));    // no
    String master = getMasterOfOldest(
        new Violin("Stradivarri", "1660-10-10"),
        new Violin("Orlov", "1938-10-10")
    );
    System.out.println(master);
  }

  public static String getMasterOfOldest(Violin... violins) {
    if(violins.length == 0){
      return null;
    }
    Violin oldestViolin = violins[0];
//    brute force
    for (Violin violin: violins){
      if(oldestViolin.getDateOfManufacturing()
          .isAfter(violin.getDateOfManufacturing())){
        oldestViolin = violin;
      }
    }
    return oldestViolin.getMasterName();
  }

  public static String palindrom(String word) {
//    базовый случай
    if (word.isEmpty() || word.length() == 1) {
      return "yes";
    }
    if (word.charAt(0) == word.charAt(word.length() - 1)) {
//      если совпали крайние символы слова
      return palindrom(word.substring(1, word.length() - 1));
    } else {
//       крайние символы не совпали
      return "no";
    }
  }

  //  palindrom("limal");
//  42. word = "limal";
//  false || false - не проходим
//  47. 'l' == 'l' - тру
//  49. palindrom("ima")
//    42. word = "ima"
//    44. false
//    47. 'i' == 'a' false
//    52. return 'no'
//  52. return 'no'
//  вуаля
  public static void recursiveCount(int number) {
//    базовый случай
    if (number == 1) {
      System.out.println(1);
    } else {
      recursiveCount(number - 1);
      System.out.println(number);
    }
  }
}