

public class Main {
    public static void main(String[] args) {
/*
            MyDate birthday = new MyDate(1,2,2000);
            Person person1 = new Person("Jack", "Johnson","123-123-123", birthday);
            Account account1 = new Account("DE1234567",5000000, person1);
            System.out.println(account1);
*/


        Person person1 = new Person("Jack", "Johnson","123-123-123", new MyDate(1,2,2000));
        Account account1 = new Account("DE1234567",5000000, person1);
        System.out.println(account1);


        System.out.println(account1.owner.toString());
        System.out.println(account1.owner.birthday.toString());
        MyDate birthday = account1.owner.birthday;



    }
}