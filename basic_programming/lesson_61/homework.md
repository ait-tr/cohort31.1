# Задача 1

Создайте класс `Person`, c полями и имя и дата рождения, которому при создании передавайте имя и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".

Реализуйте в классе интерфейс `Comparable<Person>`, в котором "меньше" будет значить "младше".


**Подсказка:** не обязательно вычислять возраст, этому мы так и не научились. Но можно сравнивать даты рождения!

Пример того как при помощи formatter можно парсить строки в date:
```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    Date octoberfest = formatter.parse("16.09.2023");
    System.out.println(octoberfest);
  }
}
```

