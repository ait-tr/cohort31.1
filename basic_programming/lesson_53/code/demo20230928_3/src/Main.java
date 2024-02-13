import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        read();
    }

    public static  void read(){

        try(FileInputStream fr = new FileInputStream("Main.class")) {

            int data;
            int counter=0;
            while ((data= fr.read())!=-1){
                System.out.print((int) data + " " + (char)data + " "  );
                counter++;
                if (counter%30==0) {
                    System.out.println();
                }
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}