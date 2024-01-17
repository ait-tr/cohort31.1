import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws IOException {

        writeFile4("Hello world! hhhshsj");
        System.out.println("done!");
    }

    public static void writeFile(String str) {
    //
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter("1111.txt");
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e){
                System.out.println("close error");
            }

        }
    }



    public static void writeFile2(String str) throws IOException {

        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter("1111.txt");
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
            fileWriter.flush();
        } finally {
            //fileWriter.close();
        }
    }


    public static void writeFile3(String str) {

        try( FileWriter fileWriter=new FileWriter("111.txt");){
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
        } catch (IOException e){
            System.out.println("!Error");
        }
    }


    public static void writeFile4(String str) {

        try( FileWriter fileWriter=new FileWriter("4.txt");){
            fileWriter.write(str);
            fileWriter.write(65);
        } catch (IOException e){
            System.out.println("!Error");
        }
    }



}