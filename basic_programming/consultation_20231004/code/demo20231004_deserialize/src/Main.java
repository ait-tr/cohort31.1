import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("demo20231004_1.dat"))) {
            int count= is.readInt();
            Person[] people = new Person[count];
            for (int i = 0; i <people.length; i++) {
                people[i]=(Person)is.readObject();
            }
            System.out.println(Arrays.toString(people));

        }
    }

}