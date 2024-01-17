import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("Jack",33, "blabla");
        Person p2 = new Person("Ann",29, "qweqwe");
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("demo20231004_1.dat"))) {
            os.writeInt(2);
            System.out.println("Out: "+p1);
            os.writeObject(p1);
            System.out.println("Out: "+p2);
            os.writeObject(p2);
        }
    }
}