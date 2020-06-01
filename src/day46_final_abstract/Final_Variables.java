package day46_final_abstract;

public class Final_Variables {

    /*
    constant, can not be changed
    can only be applied to:
             1. variables
             2. methods
             3.class
     */

         final int instanceVariable = 300; // if final variable is instance we need to initialize it immediately

         final static int staticVariable = 20;  // static variable doesn't mean it is constant we can reassign it
                                                // if it is final static variable we can not reassign it.
                                                // final static variable must initialized immediately
    public static void main(String[] args) {

        final double PI = 3.14;

        // PI = 3.15;  can not be reassigned

        final String gender = "Male";

        final int score;   // you don't need to initialize final local variables immediately
        score = 100;
        // score = 200; can not be reassigned, you can only initialized final variable just one time

        System.out.println(score);

        System.out.println("======================================================================");

        Final_Variables obj = new Final_Variables();

        // obj.instanceVariable = 400; can not be reassigned

        System.out.println(obj.instanceVariable);





    }




}
