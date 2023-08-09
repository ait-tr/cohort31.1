public class Person {
    String firstName;
    String lastName;
    String phone;
    MyDate birthday;

    public Person(String firstName, String lastName, String phone, MyDate birthday){
        this.firstName=firstName;
        this.lastName=lastName;
        this.phone=phone;
        this.birthday=birthday;
    }

    public String toString(){
        return firstName +" " + lastName + " (" +birthday.toString()+ ")" + " phone:" + phone;
    }


}
