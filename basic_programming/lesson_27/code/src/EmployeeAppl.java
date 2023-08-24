package ait.employee;

import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.WageEmployee;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee empl1 = new Manager(1000, "John", "Smith", 160, 3000, 5);
        Employee empl2 = new Manager(1000, "John", "Smith", 160, 3000, 5);
        boolean check = empl1.equals(empl2);
        System.out.println(check);
//        empl1.setFirstName("Johny");
//        System.out.println(empl1.getFirstName());
//        System.out.println(empl2.getFirstName());
        int[] arr1 = {1,2};
        int[] arr2 = {1,2};
        check = arr1.equals(arr2);
        System.out.println(check);
    }


}
