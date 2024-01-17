import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main {
  public static void main(String[] args) throws ParseException {
    List<Person> persons = List.of(
        new Person("John Watts", "22.05.1914"),
        new Person("Anna Freud", "22.06.1902"),
        new Person("John Booth", "22.05.1917"),
        new Person("Will Weathers", "22.05.1976")
    );
    List<Person> orderedPersons = persons.stream().sorted().toList();
    System.out.println(orderedPersons);

  }
}