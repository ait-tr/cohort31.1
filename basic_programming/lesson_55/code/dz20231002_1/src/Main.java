import java.io.*;

public class Main {
    private static byte[] arr1 = new byte[601];
    private static byte[] arr2 = new byte[57053];
    private static byte[] arr3 = new byte[22494];

    /*
    static byte[][] arr = new byte[3][];
    arr[0][3]
    arr[1][0]
    arr[0] = arr1;
    arr[1] = arr2;
    arr[2] = new byte[22494];
     */
    public static void main(String[] args) {
        int a=43;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));

        int b=0x2b;
        System.out.println(b);




        try {
            read();
        } catch (IOException e) {
            System.out.println("Reading file error!");
            throw new RuntimeException(e);
        }

        try {
            write(arr1);
            write(arr2);
            write(arr3);
        } catch (IOException e) {
            System.out.println("Writing files error!");
            throw new RuntimeException(e);
        }

    }

    /*
 1. читаем 3 массива заданного размера из файла
 2. анализ сигнатур
 3. запись файлов
 */

public static void write(byte[] arr) throws IOException {
    FileType fileType = getFileType(arr);
    String name="pic";
    if(fileType==FileType.CLASS) {
        name="Main";
    }
    name=name+fileType.getExt();
    try (BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(name))) {
        os.write(arr);
    }

}


public static void read() throws IOException {
    try (FileInputStream is = new FileInputStream("20231002.dat")) {
        is.read(arr1);
        is.read(arr2);
        is.read(arr3);
    }
}

public  static FileType getFileType(byte[] arr){
    byte[] gif = new byte[]{(byte)0x47, (byte)0x49, (byte)0x46, (byte)0x38, (byte)0x39, (byte)0x61};
    byte[] jpeg = new byte[]{(byte)0xff, (byte)0xd8};
    byte[] klass = new byte[]{(byte)0xca, (byte)0xfe, (byte)0xba, (byte)0xbe};

    boolean flag=true;
    for (int i = 0; i <gif.length ; i++) {
        if (arr[i]!=gif[i]){
            flag=false;
            break;
        }
    }
    if(flag) return FileType.GIF;

    flag=true;
    for (int i = 0; i <jpeg.length ; i++) {
        if (arr[i]!=jpeg[i]){
            flag=false;
            break;
        }
    }
    if(flag) return FileType.JPG;

    flag=true;
    for (int i = 0; i <klass.length ; i++) {
        if (arr[i]!=klass[i]){
            flag=false;
            break;
        }
    }
    if(flag) return FileType.CLASS;
    return null;


}




}


