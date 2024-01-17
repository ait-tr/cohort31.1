import java.io.*;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        readWrite();
    }

    public static  void readWrite(){

        try(BufferedReader br = new BufferedReader(new FileReader("buf.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("buf2.txt"))) {
               String line=null;
               while ((line=br.readLine())!=null){
                   System.out.println(line);
                   bw.write(line);
                   bw.newLine();
               }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}