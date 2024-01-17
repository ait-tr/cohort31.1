import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
  public static void main(String[] args) {
    Calendar calendar = new GregorianCalendar();
    Date current = calendar.getTime();
    System.out.println(current);

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy, dd, MM");
    String currentAsString = formatter.format(current);
    System.out.println(currentAsString);
//4 цифры для года (yyyy);
//2 цифры для месяца (ММ);
//2 цифры для дня (dd);
//2 цифры для часов в 24-часовом формате (HH);
//2 цифры для минут (mm);
//2 цифры для секунд (ss). Знаки разделения и порядок расстановки символов шаблона сохраняется.
//    Задание
//    Создайте и выведите следующее значение "2018-12 13"  Год месяц день
    Calendar calendar1 = new GregorianCalendar(2018, Calendar.DECEMBER, 13);
    Date date = calendar1.getTime();
    SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM dd");
    String dateString = formatter1.format(date);
    System.out.println(dateString);

//    как мы можем ее изменить, чтобы это происходило умным методом
    calendar1.add(Calendar.DATE, 20);
    System.out.println(calendar1.getTime());
    calendar1.add(Calendar.DATE, -20);
    System.out.println(calendar1.getTime());
  }
}