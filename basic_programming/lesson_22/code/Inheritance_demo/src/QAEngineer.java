public class QAEngineer extends Employee{


    public QAEngineer(String name, int salary) {
        super(name,salary);
    }


    @Override
    public String toString() {
        return "QAEngineer " + super.getName()+ " " + super.getSalary();
    }


    public void work(){
        System.out.println("I'm " +super.getName() + " I'm a QAEngineer. I check soft ");
    }

}
