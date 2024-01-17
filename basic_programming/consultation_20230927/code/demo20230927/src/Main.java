import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // JIT (just in time)
        String data =read();
        List<Person> people = getPeople(data);

        System.out.println(people);
        System.out.println("done!");

    }



    public static List<Person> getPeople(String data) {
        List<Person> people = new ArrayList<>();
        String[] dataArray = data.split(";");
        for(String str:dataArray){
            try {
                people.add(new Person(str));
            } catch (PersonCreateException e){
                System.out.println("Error parsing: " + str);
            }
        }
        return people;
    }

    public static String read(){
        try(FileReader fr= new FileReader("person.txt")) {
            int data;
            StringBuilder sb= new StringBuilder();

            while ((data=fr.read())!=-1){
                sb.append((char)data);
            }
            return sb.toString();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}