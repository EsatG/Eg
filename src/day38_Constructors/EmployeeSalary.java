package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {

        SalaryCalculator esat = new SalaryCalculator(55,40,0.0825,0.2);

        System.out.println(esat.Salary());
        System.out.println(esat);

    }
}
