import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        write();
    }
    public static  void write() throws IOException {
        /*
        DataOutputStream os = new DataOutputStream(new FileOutputStream("5.dat"));
        os.writeBoolean(true);
        os.writeInt(123);
        os.writeDouble(55.98);
        os.writeUTF("привет");
        os.close();
        */
        DataInputStream is= new DataInputStream(new FileInputStream("5.dat"));
        System.out.println(is.readBoolean());
        System.out.println(is.readInt());
        System.out.println(is.readDouble());
        System.out.println(is.readUTF());




    }


}