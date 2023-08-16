public class SupportEngineer extends Employee{
    public SupportEngineer(String name, int salary) {
        super(name,salary);
    }


    @Override
    public String toString() {
        return "SupportEngineer " + super.getName() + " " + super.getSalary();
    }


    public void work(){
        System.out.println("I'm " +super.getName() + " I'm a SupportEngineer. I contact with clients ");
    }

}
