import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Conference> conferences = List.of(
        new Conference("project", "17-10-2023", "09-30", "http..."),
        new Conference("threads", "16-10-2023", "09-30", "http..."),
        new Conference("project2", "15-10-2023", "09-30", "http...")
    );
    List<Conference> orderedConferences = conferences.stream().sorted().toList();
    System.out.println(orderedConferences);

    String res =
        getIntervalDescription(LocalDate.now(), LocalDate.of(2021, 12,24));
    System.out.println(res);
  }

  public static String getIntervalDescription(LocalDate date1, LocalDate date2) {
//    "10 years, 2 months, 3 days"
    LocalDate earlierDate = date1.isBefore(date2) ? date1 : date2;
    LocalDate laterDate = date1.isAfter(date2) ? date1 : date2;
    Period period = Period.between(earlierDate, laterDate);
    int years = period.getYears();
    int months = period.getMonths();
    int days = period.getDays();
    return String.format("%d years, %d months, %d days", years, months, days);
//    %d - digit - для целочисленных
//    %f - float - для даблов и флот %.2f - это 3.33
//    %s - String - для строк
//    %b - boolean - для булеан
  }
}