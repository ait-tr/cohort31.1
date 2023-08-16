public class Programmer extends Employee {

    public Programmer(String name, int salary) {
        super(name, salary);  // super is the reference to Employee class
    }

    @Override
    public String toString() {
        return "Programmer " + super.getName() + " " + super.getSalary();
    }

    @Override
    public void work(){
        System.out.println("I'm " +super.getName() + " I'm a developer. I write soft ");
    }

    public void writeCode(){
        System.out.println("writeCode .... writeCode");
    }



}
