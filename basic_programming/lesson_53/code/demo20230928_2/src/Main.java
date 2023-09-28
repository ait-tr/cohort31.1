import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        read();
    }

    public static  void read(){

        try(FileReader fr = new FileReader("buf.txt")) {

            char[] data= new char[20];
            int count;
            while ((count= fr.read(data))!=-1){
                if(count==data.length) {
                    System.out.print(new String(data));
                } else {
                    data = Arrays.copyOf(data,count);
                    System.out.print(data);
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