import java.time.LocalDate;

public class Task {
  private String title;
  private String description;
  private boolean status;
  private LocalDate date;

  public void switchStatus() {
    status = !status;
  }

  public void procrastinate() {
    date = date.plusDays(1);
  }

  public void changeTitle(String title) {
    if (title == null || title.isEmpty()) {
      return;
    }
    this.title = title;
  }

  public Task(String title, String description, String date) {
    this.title = title;
    this.description = description;
    this.status = false;
    this.date = LocalDate.parse(date);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Task{" +
        "title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", status=" + status +
        ", date=" + date +
        '}';
  }
}
