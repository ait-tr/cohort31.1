import java.io.Serializable;


public class Person implements Serializable {
    public static final long serialVersionUID = 2L;
    private String name;
    private int age;
    private int temp;
    private int temp1;
    private transient Car car;


    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
