package day02_Variables;

public class EmployeeInfo_Variables {

    public static void main(String[] args) {

        /*

        */

       String employeeName= "Esat";
        String companyName= "Apple";
        int employeeId= 9;
        String jobTitle= "QA";
        double salary = 100000.5;
        long ssn= 123456789;
        /*
        System.out.println("Employee Name: " +employeeName);
        System.out.println("Company Name: " +companyName);
        System.out.println("Employee ID: " +employeeId);
        System.out.println("Job Title: " +jobTitle);
        System.out.println("Salary: " +salary);
        System.out.println("SSN: "+ssn);

        */
        System.out.println("Employee Name: " +employeeName + "\nCompany Name: " +companyName + "\nEmployee ID: "
                +employeeId + "\nJob Title: " +"\n"+jobTitle + "\nSalary: " +salary +"\nSSN: " +ssn);

        System.out.println("==================================================================================");


        String firstName= "Esat";
        String lastname= "Gorgun";
        System.out.println(firstName+ " "+lastname);

        System.out.println( 11 + 10); //21, addition
        System.out.println("11"+"10"); //1110, concatenation
        System.out.println( 11 + 10+"esat");  // first addition then concatenation
    }
}
