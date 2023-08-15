
public class Main {
    public static void main(String[] args) {

        Student[] students={
          new Student("Jack"),
          new Student("John"),
          new Student("Poul"),
          new Student("Ann"),
          new Student("Lena"),
          new Student("Stan"),
          new Student("Rick"),
        };

        for (Student st: students){
            st.ask();
        }

        students[1].ask();
        students[1].ask();

    }
}