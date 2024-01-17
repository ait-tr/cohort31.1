import java.io.Serializable;
// write
public class Person  implements Serializable {
    private static final long serialVersionUID =98763298L;
    private String name;
    private int age;

    private transient String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
