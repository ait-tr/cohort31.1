import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//JSON
/*
{
namee:"eer",
age: 77
}
*/
public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> people = new ArrayList<>();
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("demo20231004_1.dat"))) {
            int count= is.readInt();
            while (true){
                people.add((Person)is.readObject());
            }
        } catch (EOFException e){
            System.out.println(people);
        }
    }

}