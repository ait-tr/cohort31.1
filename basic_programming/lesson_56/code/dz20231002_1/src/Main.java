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
    String name="pict";
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
        for(FileType ft: FileType.values()){
            if(ft.checkType(arr)) return ft;
        }
        return null;
    }


}


