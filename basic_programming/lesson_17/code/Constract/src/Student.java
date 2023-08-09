public class Student {
    String firstName;
    String lastName;
    MyDate birthday;
    String group;
    MyDate startCourse;



    public String toString(){
        return firstName + " "+lastName +"("+ birthday.toString()+")" + " group: " + group + " Course start: " + startCourse.toString();
    }

    public void  sayHello(){
        System.out.println("hello, I'm a student  " + firstName +" " + lastName );
    }





}

