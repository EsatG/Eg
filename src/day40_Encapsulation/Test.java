package day40_Encapsulation;

public class Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        // System.out.println(obj.SSN); // error=> it (SSN) is private so it can be only accessed in its own class

        System.out.println( obj.getSSN() );

        //obj.SSN = 12345;  //error=> we can not get the private data directly

        obj.setSSN(12345);

        System.out.println( obj.getSSN() );





    }
}
