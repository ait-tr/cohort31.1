import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person>{
  private String name;
  private Date birthDate;

  public Person(String name, String birthDate) throws ParseException {
    this.name = name;
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    this.birthDate = formatter.parse(birthDate);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public int compareTo(Person o) {
    return o.birthDate.compareTo(this.birthDate);
  }

  @Override
  public String toString() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    return "Person{" +
        "name='" + name + '\'' +
        ", birthDate=" + formatter.format(birthDate) +
        '}';
  }
}
