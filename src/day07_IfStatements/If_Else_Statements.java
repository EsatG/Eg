package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {

        int number =-1;

        /*if (number > 0){
            System.out.println(number+ " is positive");
        }

        if(number < 0){
            System.out.println(number + " is negative");
        } */
        if (number > 0) {
            System.out.println(number + " is positive");
        }
          else {
            System.out.println(number + " is negative");
        }
        System.out.println("================================================================================");

          int num = 99;
          if (num % 2==0){
              System.out.println(num + " is even number");
          }
          else {                                            // otherwise
              System.out.println(num + " is odd number");
          }
        System.out.println("===================================================================================");
          int age = 19;
          if (age >= 21){
              System.out.println("Here is your Vodka");
          }
          else {
              System.out.println("Here is your Milk");
          }
        System.out.println("======================================================================================");
          boolean testedPositiveForCorona = false;
          if (testedPositiveForCorona) {
              System.out.println("Stay at home");
          }
          else {
              System.out.println("Do more coding");
          }
        System.out.println("================================================================================");

          long f =54545112l;
          int ff = (byte) f;
        System.out.println(ff);






    }

}
