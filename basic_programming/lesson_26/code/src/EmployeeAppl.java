package ait.employee;

import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.WageEmployee;

public class EmployeeAppl {
    public static void main(String[] args) {
//        int a = 15;
//        long x = a;
//        byte b = (byte) a;
//        Object obj = "Hello";
//        obj = new Manager(1000, "John", "Smith", 160, 3000, 5);
//        Manager manager = new Manager(1000, "John", "Smith", 160, 3000, 5);
//        manager.calcSalary();
        Employee[] employees = new Employee[6];
        System.out.println(employees.toString());
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 80, 30000, 0.1);
//        employees[4] = new Employee(5000, "Ivan", "Balda", 160);
        printArray(employees);
        double total = totalSalary(employees);
        System.out.println("Total salary = " + total);
        total = totalSales(employees);
        System.out.println("Total sales = " + total);
    }

    private static double totalSales(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof SalesManager) {
                SalesManager sm = (SalesManager) employees[i];
                sum += sm.getSalesValue();
            }
        }
        return sum;
    }

    private static double totalSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].calcSalary();
            }
        }
        return sum;
    }

    private static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }
}
