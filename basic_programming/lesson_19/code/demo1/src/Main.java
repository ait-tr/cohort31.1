
public class Main {
    public static void main(String[] args) {



        MyDate date1 = new MyDate(10,1,2022);

        System.out.println(date1);


        System.out.println("day:" + date1.getDay());
        System.out.println("month:"+ date1.getMonth());
        System.out.println("year:" + date1.getYear());


        boolean format = false; // getFromPropertiesFile(), getFromScanner(), getFromFrontEnd()

        date1.setFormat(format);
        System.out.println(date1);

    }
}