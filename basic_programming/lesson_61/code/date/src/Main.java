import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
  public static void main(String[] args) throws IOException {
//    1996 - создание класса Date
    Date date = new Date();
    System.out.println(date.getTime());
    // 1697015612549 Unix Timestamp - миллисекунды
    //- это количество миллисекунд с 1970 1 января
    System.out.println(date);
    System.out.println("Секунды:" + date.getTime() / 1000);
    System.out.println("Минуты:" + date.getTime() / 1000 / 60);
    System.out.println("Часы:" + date.getTime() / 1000 / 60 / 60);
    System.out.println("Дни:" + date.getTime() / 1000 / 60 / 60 / 24);
    System.out.println("Года:" + date.getTime() / 1000 / 60 / 60 / 24 / 365); // не 365.2 - почва для проблем
//    Проблемы класса Date
    System.out.println(date.getMonth());  // 9 месяц - а должен 10
//    то есть нумерация с нуля
    System.out.println(date.getYear()); // c 1900 года
    date.setYear(125);
    System.out.println(date.getYear());
    // 1997 Calendar - для работы с классом Date - в нем есть более адекватные методы
    Calendar calendar = new GregorianCalendar();
    System.out.println(calendar);
    Date current = calendar.getTime(); // получили дату
    System.out.println(current); // Wed Oct 11 11:43:26 CEST 2023
    calendar.set(Calendar.DATE, 15); // поменял число на пятнадцатое
//    calendar.set(Calendar.YEAR, 2020); // поменял год на 2020
//    calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY); // задали день недели на среду
    System.out.println(calendar.getTime()); // получаем новый экземпляр даты
    int currentYear = calendar.get(Calendar.YEAR); // получение информации о годе
    System.out.println(currentYear);
//  Пример создания календаря с параметрами конструктора
    Calendar calendar1 = new GregorianCalendar(2022, Calendar.JANUARY, 28);

    Calendar calendar2 = new GregorianCalendar();
    calendar2.roll(Calendar.DATE, -20); // изменяет дату на переданное значение
    System.out.println(calendar2.after(calendar1)); // сравнение календарей
    System.out.println(date.before(new Date()));    // сравнение дат
    System.out.println(calendar2.getTime());

//    Как вас зовут? Год рождения? Тогда вам 45
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();
    System.out.println("Приятно познакомиться, " + name + " Какого ты года рождения?");
    int yearOfBirth = Integer.parseInt(br.readLine());
    int age = calendar.get(Calendar.YEAR) - yearOfBirth;
    System.out.println("Значит, тебе " + age + " или "+ (age-1));
  }
}