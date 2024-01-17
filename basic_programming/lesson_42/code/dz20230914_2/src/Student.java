import java.util.Objects;

public class Student {
    private String name;
    private int id;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return id+". " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
