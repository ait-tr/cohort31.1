import java.io.*;

public class WriterObj {

    public static void main(String[] args) throws IOException {
        Person p1= new Person("john", 20, new Car("opel"));
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("object_out2.dat"))) {
            os.writeObject(p1);
        }
    }
}