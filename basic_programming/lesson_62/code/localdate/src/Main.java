import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
//    Java 8 - new API to work with date and time
//    LocalDate - год, месяц, день
//    LocalTime - как на часах
//    LocalDateTime - все вместе: год, месяц, день + конкретное время
//    ISO-8601
//    I. How to create an instance?
//    of(), now()
    LocalDate today = LocalDate.now();
    System.out.println(today);    // 2023-10-12
//    вобьем вручную
    LocalDate tomorrow = LocalDate.of(2023, 10, 13);
    System.out.println(tomorrow); // 2023-10-13

    LocalTime moment = LocalTime.now();
    System.out.println(moment); // 10:51:37.954051
    LocalTime endOfLesson = LocalTime.of(13,0,0);

    LocalDateTime thisPointInTime = LocalDateTime.now();
    System.out.println(thisPointInTime); // 2023-10-12T10:55:15.068972
    LocalDateTime endOfTomorrowLesson =
        LocalDateTime.of(2023, 10, 13, 13, 0,0);
    LocalDateTime endOfTomorrowClass =
        LocalDateTime.of(tomorrow, endOfLesson);
    System.out.println(endOfTomorrowLesson); // 2023-10-13T13:00
//    II. Immutability - неизменяемость/немутабельность
//    LocalDate и остальные - являются немутабельными
    LocalDate dayAfterTomorrow = today.plusDays(2);
    System.out.println(dayAfterTomorrow); // мы создали совершенно новый объект
    System.out.println(today); // 2023-10-12 - today не изменился
//    Для изменения времени есть методы plus..., minus...
    LocalDate dayOfNextWeek = today.plusDays(7);
    System.out.println(dayOfNextWeek); // 2023-10-19
    LocalDate dayOfLastWeek = today.minusDays(7);
    System.out.println(dayOfLastWeek); // 2023-10-05
//    .plusDays() .plusMonths(), .plusYears()
//    .minusDays() .minusMonths(), .minusYears()
    LocalTime consultation = endOfLesson
        .plusHours(2).plusMinutes(30);
    System.out.println(consultation);
    LocalTime consultation2 = LocalTime.of(15, 30);
//    III. Getting fields values
    int numberOfDayToday = today.getDayOfMonth();
    System.out.println(numberOfDayToday); // 12 - день с начала месяца
    int numberOfDayFromYearBeginning = today.getDayOfYear();
    System.out.println(numberOfDayFromYearBeginning); // 285 - c начала года
    DayOfWeek todayDayOfWeek = today.getDayOfWeek();
    System.out.println(todayDayOfWeek);
    System.out.println(DayOfWeek.MONDAY); // как вы поняли это enum
    String germanDay = DayOfWeek.MONDAY
        .getDisplayName(TextStyle.FULL, Locale.GERMAN);
    System.out.println(germanDay); // Montag
//    также можно получать LocalTime
    int currentHour = moment.getHour();
    System.out.println(currentHour);
//    IV. Period - промежуток времени
    LocalDate unity = LocalDate.of(1990, 10, 3);
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

//  Assume that my vacation starts 2024.02.12
//  And vocation is 14
    LocalDate startOfVacation = LocalDate.of(2024, 2, 12);
    LocalDate endOfVacation = startOfVacation.plus(vacation);
    System.out.println(endOfVacation); // 2024-02-26

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

//    Practice
//    Создайте класс Conference - с полями:
//    - тема String
//    - время LocalDateTime
//    - ссылка на приглашение String
//    В конструкторе конференции нужно принимать отдельно две строки
//    date - "dd-MM-yyyy", time "HH-mm" и остальную необходимую информацию
//    Создайте лист конференций и отсортируйте их по возрастанию
  }
}