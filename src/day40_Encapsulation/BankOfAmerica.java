package day40_Encapsulation;

public class BankOfAmerica {

    public static void main(String[] args) {

        EmployeeInfo esat = new EmployeeInfo();

        esat.setAddress("Wethersfield CT");


        System.out.println( esat.getAddress() );
        System.out.println( esat.companyName );
        System.out.println( esat.getSalary() );




    }
}
