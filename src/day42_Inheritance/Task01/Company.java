package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
/*
create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */

    public static Employee employee1 = new Employee();
    public static Employee employee2  = new Employee();
    public static Employee employee3  = new Employee();

     static {

            employee1.setEmployeeInfo("John", 25, 'M', 80000, 123, "Cashier");
            employee2.setEmployeeInfo("Chloe", 28, 'F', 95000, 456, "Assistance");
            employee3.setEmployeeInfo("Muhtar", 32, 'M', 110000, 789, "Instructor");

        }

    public static void main(String[] args) {

         Employee[] employees = {employee1, employee2, employee3};


        for(int i = 0; i < employees.length; i++) {

            System.out.println("Name: " + employees[i].name + ", ID: " + employees[i].employeeID);


        }
    }
}
