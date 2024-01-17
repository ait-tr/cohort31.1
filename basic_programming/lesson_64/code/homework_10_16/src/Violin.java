import java.time.LocalDate;

public class Violin {
  private String masterName;
  private LocalDate dateOfManufacturing;

  public Violin(String masterName, String date) {
    this.masterName = masterName;
//  "2022-10-16"
    this.dateOfManufacturing = LocalDate.parse(date);
  }

  public String getMasterName() {
    return masterName;
  }

  public LocalDate getDateOfManufacturing() {
    return dateOfManufacturing;
  }
}
