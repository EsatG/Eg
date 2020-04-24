package day03_VariablesContinue;

public class SalaryCalculator {

    /*    Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD


     */

    public static void main(String[] args) {

        // DataType   variableName = Data;

        double HourlyRate= 55;
        double stateTaxRate= 0.04;
        double federalTaxRate= 0.22;
        byte weeklyHours= 40;
        byte totalWeeks=52;

        // salary=hourlyRate * weeklyHours * 52
        double salary = HourlyRate * weeklyHours * totalWeeks;  //salary before tax

        //stateTax=salary * stateTaxRate
        double stateTax=salary * stateTaxRate;

        // federalTax= salary * federaltaxRate
        double federalTax= salary * federalTaxRate;

        //salaryAfterTax = salary - stateTax - fedaralTax
        double salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your salary is: $"+salary); //concatenation

       /*
        System.out.println("9" + 3); // 93->concatenation
        System.out.println(9+"3"); // 93-> concatenation
        System.out.println(9 + 3); // 12-> addition        */


        System.out.println("State Tax is: $"+stateTax);
        System.out.println("Federal Tax is: $"+ federalTax);
        System.out.println("Total Tax is: $" + (federalTax + stateTax)  );
        System.out.println("Your salary after tax is: $"+salaryAfterTax);









    }
}
