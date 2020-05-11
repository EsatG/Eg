package day37_Constructors;

import java.util.ArrayList;

public class BankOfAzerbaijan {
    /*
    in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info

     */

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);

        System.out.println(list.get(0));  // it pulls information from "static" block which in "HumanResources" class
        System.out.println(list.get(1));

    }
}
