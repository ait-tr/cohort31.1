import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main2 {
    public static void main(String[] args) {
        read();
    }
    public static void read(){
        //System.out.println(Charset.availableCharsets());
        try(FileReader fileReader = new FileReader("111.txt");) {
            int data;
            while ((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("read file error!");
        }

    }
    public static void read2(){
        //System.out.println(Charset.availableCharsets());
        try(FileReader fileReader = new FileReader("111.txt", Charset.forName("windows-1251"));) {
            int data;
            while ((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("read file error!");
        }

    }



}
