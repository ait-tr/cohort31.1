import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            readWrite2();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readWrite() throws IOException {
        byte[] array ={12,12,13,14,15,16};
        URL url = new URL("https://i.natgeofe.com/n/4f5aaece-3300-41a4-b2a8-ed2708a0a27c/domestic-dog_thumb_square.jpg");
        try (//InputStream fis = new FileInputStream("4.txt");
             BufferedOutputStream fos= new BufferedOutputStream(new FileOutputStream("file.jpg"));
             //BufferedInputStream fis = new BufferedInputStream(new ByteArrayInputStream(array))){
             BufferedInputStream fis = new BufferedInputStream(url.openStream())) {
            int data;
            while ((data= fis.read())!=-1){
                System.out.printf("%c",data);
                fos.write(data);
            }
            System.out.println();
        }
    }

    public static void readWrite2() throws IOException {

        URL url = new URL("https://i.natgeofe.com/n/4f5aaece-3300-41a4-b2a8-ed2708a0a27c/domestic-dog_thumb_square.jpg");
        try (//InputStream fis = new FileInputStream("4.txt");
             BufferedOutputStream fos= new BufferedOutputStream(new FileOutputStream("file3.jpg"));
             //BufferedInputStream fis = new BufferedInputStream(new ByteArrayInputStream(array))){
             BufferedInputStream fis = new BufferedInputStream(url.openStream())) {
            fis.transferTo(fos);

        }
    }

}