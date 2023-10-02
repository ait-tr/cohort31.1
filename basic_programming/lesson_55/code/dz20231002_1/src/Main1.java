import java.io.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.dat");
        FileOutputStream out = new FileOutputStream("file1.dat");
        int data;
        int counter=0;

        while ((data= fis.read())!=-1 && counter<600){
            System.out.println(data);
            out.write(data);

            counter++;
        }

        byte[] bytes1 = new byte[3];
        byte[] bytes2 = new byte[5];
        byte[] bytes3 = new byte[1];
        int count = fis.read(bytes1);
        count = fis.read(bytes2);
        count = fis.read(bytes3);


        byte[] bytesAll = new byte[601+5878 + 8666];
        fis.read(bytesAll);

        byte[] bytes100 = new byte[100];

        fis.read(bytes100, 10, 50);

        byte[] bytesItog = new byte[9];
        fis.read(bytesItog,0,3);
        fis.skip(2);
        fis.read(bytesItog,3,4);
        fis.skip(1);
        fis.read(bytesItog,7,2);

    }
}










