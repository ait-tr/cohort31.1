public class Student {
    private String name;
    private int lessons;

    public Student(String name, int lessons) {
        this.name = name;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public int getLessons() {
        return lessons;
    }

    @Override
    public String toString() {
        return name + " ("+lessons+")";
    }
}
