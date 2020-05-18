package day41_Inheritance.Task01;

public class EmployeeObjects {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Esat",120000,123456,"Software Developer",'M');

        dev1.coding();
        dev1.fixing();

        System.out.println(dev1);

        System.out.println("=====================================================================================");

        Tester tester1 = new Tester("Esat",110000,123,"SDET",'M');

        tester1.reporting();
        tester1.testing();

        System.out.println(tester1);



    }
}
