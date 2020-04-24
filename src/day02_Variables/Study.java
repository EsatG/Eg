package day02_Variables;

public class Study {

    public static void main(String[] args) {

        int salary= 150000;
        double fedtax=0.18;
        float statetax=0.065f;

        double totaltax= fedtax + statetax;
        double salaryaftertax= salary*(1-totaltax);
        System.out.println(salaryaftertax);
        System.out.println("==========================================================================");

       /*  Create a class called salary calculator, write a program that can calculate the tax,
       and salary after tax based on the hourly rate & tax rate
       rate = 55;
        stateTax = 0.04;
        federalTax =0.22;
        weeklyHours = 40;    */

        // Salary=rate*weeklyhours*4*12
        // Totaltax=statetax + federaltax
        // SalaryAfterTax= Salary*(1-Totaltax)

        int rate= 55;
        double stateTax= 0.04;
        float fedTax= 0.22f;
        short weeklyHours= 40;


        double totalTax= fedTax + stateTax;
        salary=rate*weeklyHours*4*12;
        double taxrate=salary*totalTax;
        salaryaftertax= salary*(1-totalTax);
        System.out.println(salaryaftertax);
        System.out.println(salary);
        System.out.println(totalTax);
        System.out.println(taxrate);



    }



}
