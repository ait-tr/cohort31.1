# LocalDate, LocalTime, LocalDateTime

Класс LocalDate из пакета java.time предназначен для работы с датами. Функционал этого класса позволяет создавать даты и
изменять их, добавляя и отнимая необходимое количество дней/месяцев/лет.

## Как создать?

```java
    LocalDate today=LocalDate.now();
    System.out.println(today);    // 2023-10-12

    LocalDate tomorrow=LocalDate.of(2023,10,13);
    System.out.println(tomorrow); // 2023-10-13
```

## Как создать LocalTime?
```java
LocalTime moment = LocalTime.now();
System.out.println(moment); // 10:51:37.954051
LocalTime endOfLesson = LocalTime.of(13,0,0);
```

## Как создать LocalDateTime?
```java
LocalDateTime endOfTomorrowClass =
        LocalDateTime.of(tomorrow, endOfLesson);
System.out.println(endOfTomorrowLesson); // 2023-10-13T13:00
LocalDateTime endOfTomorrowLesson =
        LocalDateTime.of(2023, 10, 13, 13, 0,0);
```
## Основные методы LocalDate:

- static LocalDate now(): возвращает объект, который представляет текущую дату

- static LocalDate of(int year, int month, int day): возвращает объект, который представляет дату с определенными годом,
  месяцем и днем

- int getYear(): возвращает год даты

- int getMonthValue(): возвращает месяц

- int getDayOfMonth(): возвращает день месяца (значение от 1 до 31)

- int getDayOfYear(): возвращает номер дня года (значение от 1 до 365)

- DayOfWeek getDayOfWeek(): возвращает день недели в виде значения перечисления DayOfWeek

- LocalDate plusDays(int n): добавляет к дате некоторое количество дней

- LocalDate plusWeeks(int n): добавляет к дате некоторое количество недель

- LocalDate plusMonths(int n): добавляет к дате некоторое количество месяцев

- LocalDate plusYears(int n): добавляет к дате некоторое количество лет

- LocalDate minusDays(int n): отнимает от даты некоторое количество дней

- LocalDate minusMonths(int n): отнимает от даты некоторое количество месяцев

- LocalDate minusWeeks(int n): отнимает от даты некоторое количество недель

- LocalDate minusYears(int n): отнимает от даты некоторое количество лет

## Как парсить и форматировать? Класс DateTimeFormatter
```java
//  V. How to parse string? And to format?
//  Если строка приходит через дефис - 2022-12-12
//    Parse
    LocalDate christmas = LocalDate.parse("2023-12-24");
    System.out.println(christmas); // 2023-12-24
//    if format is different - we can use DateTimeFormatter
    DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("yyyy/MM/dd");
//    указали какой формат у входящей строки
    String input = "2023/12/12";
    LocalDate orthodoxChristmas = LocalDate.parse(input, formatter);

//    Format
    String unitySlashStyle = formatter.format(unity);
    System.out.println(unitySlashStyle);
    
```

## Period
```java
//  We can calculate period between those dates.
    Period period = Period.between(unity, today);
    System.out.println(period); // P33Y9D
    System.out.println(period.getYears()); // 33 года
    System.out.println(period.getMonths()); // 0 месяцев
    System.out.println(period.getDays()); // 9 дней
//  How else can we create a period?
    Period vacation = Period.of(0,0,14);
    System.out.println(vacation); // P14D
    int vacationLength = vacation.getDays();
    System.out.println(vacationLength); // 14
```