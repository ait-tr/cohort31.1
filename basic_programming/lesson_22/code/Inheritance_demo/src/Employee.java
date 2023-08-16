public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void paidSalary(){
        System.out.println("I'm " +name + " I get salary "+ salary);
    }

    public void work(){}

    /*
    public void writeCode(){
        System.out.println("I can't write code");
    }

     */



}
