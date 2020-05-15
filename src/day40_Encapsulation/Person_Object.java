package day40_Encapsulation;

public class Person_Object {

    public static void main(String[] args) {

        Person esat = new Person("Esat");

        esat.setSSN(12345);
        esat.setID(456);

        System.out.println( esat.name );
        System.out.println( "SSN: " + esat.getSSN() );
        System.out.println("ID: " + esat.getID() );

        System.out.println(esat);


    }

}
