

public class Main {
    public static void main(String[] args) {

        Employee p1               =new Programmer("Jack", 5000);
        Programmer p2             =new Programmer("Nick", 3000);

        Employee q1=new QAEngineer("Ann", 4000);
        QAEngineer q2=new QAEngineer("Sten", 5500);

        SupportEngineer s1= new SupportEngineer("Lena", 4200);


        p1.work();
        p1.paidSalary();

        q1.work();
        q1.paidSalary();

        //p1.writeCode();
        //q1.writeCode();


        // IS A


        Employee[] employees={p1,p2,q1,q2,s1};
        for (Employee e:employees){
            e.work();
        }

        ((Programmer)p1).writeCode(); // cast Employee to Programmer


        System.out.println(p1);
        System.out.println(p2);





    }
}