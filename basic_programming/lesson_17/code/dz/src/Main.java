
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            #1 Создать класс Student со следующими полями (String firstName, String lastName,
            MyDate birthday, String group, MyDate startCourse}
            Создайте пару объектов этого класса. Напишите метод studentToString(Student student),
            который возвращает строку с данными студента.

         */


        System.out.println("Hello! You're welcome on my page\n");
        Scanner scanner = new Scanner(System.in);

        Student student = getStudentFromScanner(scanner, "Please, enter your name, lastname, day of birth, your group name and date of your course start\n");
        System.out.println(studentToString(student));


    }

    public static Student getStudentFromScanner(Scanner scanner, String msg){
        System.out.println(msg);
        Student student = new Student();
        System.out.println("Input first name:");
        student.firstName = scanner.nextLine();

        System.out.println("Input last name:");
        student.lastName = scanner.nextLine();
        student.birthday = getMyDateFromScanner(scanner, "Input date of birthday.");

        System.out.println("Input group:");
        student.group = scanner.nextLine();

        student.startCourse = getMyDateFromScanner(scanner, "Input date of curse start:");
        return student;
    }

    public static MyDate getMyDateFromScanner(Scanner scanner, String msg){
        System.out.println(msg);
        MyDate date = new MyDate();
        System.out.println("Input day:");
        date.day = scanner.nextInt();
        System.out.println("Input month:");
        date.month = scanner.nextInt();
        System.out.println("Input year:");
        date.year = scanner.nextInt();
        scanner.nextLine();
        return date;
    }

    public static MyDate createDate(int day, int month, int year){
        MyDate date = new MyDate();
        date.day = day;
        date.month = month;
        date.year = year;
        return date;
    }


    public static String studentToString(Student student){
        return student.firstName + " "+student.lastName +"("+ dateToString(student.birthday)+")" + " group: " + student.group + " Course start: " +dateToString(student.startCourse);
    }

    public static String dateToString(MyDate date){
        String [] months = {"" ,"January","February","March","April","May","June","July","August","September","October","November","December"};
        if (date.day<0 || date.day>31){return "error";}
        if (date.month<0 || date.month>12){return "error";}

        return (date.day<10?"0"+date.day:date.day) + " " + months[date.month] + " " + date.year;
    }

}
