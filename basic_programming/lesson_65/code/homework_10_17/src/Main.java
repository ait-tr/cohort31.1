import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
//  1. Сегодня возраст нашего героя - 50 лет, сколько лет ему было в 2007
    int age = 50;
    LocalDate today = LocalDate.now();
    LocalDate today50yearsAgo = today.minusYears(age);
    LocalDate todayInYear2007 = today.withYear(2007);
    Period period = Period.between(today50yearsAgo, todayInYear2007);
    int ageIn2007 = period.getYears();
    System.out.println(ageIn2007);
//    Alex variant
    int ageIn2007ver2 = age - (today.getYear() - 2007);
    System.out.println(ageIn2007ver2);
    int ageIn2007ver3 = age - Period.between(todayInYear2007, today).getYears();
    System.out.println(ageIn2007ver3);
// 2. Todo list
    List<Task> tasks = new ArrayList<>(List.of(
        new Task("Начать проект", "Разобраться со структурой", "2023-10-17"),
        new Task("Субботний отдых", "Отдохнуть перед курсом фронта", "2023-10-21"),
        new Task("Фронт", "Начать курс фронта", "2023-10-23"),
        new Task("Конец фронта", "Написать проект", "2023-12-10")
    ));
//    - Поменяйте название на прописные буквы для тех задач,
//        которые будут в течение 10 дней с настоящего момента.
    tasks.forEach(task -> {
      LocalDate deadline = LocalDate.now().plusDays(10);
      if (task.getDate().isBefore(deadline.plusDays(1)) &&
          task.getDate().isAfter(LocalDate.now().minusDays(1))
      ) {
        task.changeTitle(task.getTitle().toUpperCase());
      }
    });
    System.out.println(tasks);
//    - Поменяйте статус у задач, которые назначены на субботу.
    tasks.forEach(task -> {
      if (task.getDate().getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
        task.switchStatus();
      }
    });
//        - Напишите метод procrastinate - который откладывает задачу на один день.
//        - Отложите все задачи листа на один день.
    tasks.forEach(Task::procrastinate);
    System.out.println(tasks);
  }
}