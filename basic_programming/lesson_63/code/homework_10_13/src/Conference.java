import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Conference implements Comparable<Conference> {
  private String topic;
  private LocalDateTime time;
  private String link;

  public Conference(String topic, String date, String time, String link) {
    this.topic = topic;
//    DateTimeFormatter formatter =
//        DateTimeFormatter.ofPattern("dd-MM-yyyy");
//    LocalDate localDate = LocalDate.parse(date, formatter);
//    DateTimeFormatter timeFormatter =
//        DateTimeFormatter.ofPattern("HH-mm");
//    LocalTime localTime = LocalTime.parse(time, timeFormatter);
//    this.time = LocalDateTime.of(localDate, localTime);
    DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd-MM-yyyyHH-mm");
    this.time = LocalDateTime.parse((date + time), formatter);
    this.link = link;
  }

  @Override
  public String toString() {
    return "Conference{" +
        "topic='" + topic + '\'' +
        ", time=" + time +
        ", link='" + link + '\'' +
        '}';
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  @Override
  public int compareTo(Conference o) {
    return this.time.compareTo(o.time);
  }
}
