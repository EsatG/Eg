package day44_Exceptions;

public class Unchecked {
    /*
    unexpected and unwanted events
    there are two types of exception:
             1- checked (unwanted event) : occurs during the compile time; you have to handle immediately
             2-unchecked exception(unexpected event): occurs during run time

     */

    public static void main(String[] args) {

        System.out.println("Test started");

      //  System.out.println( 9 / 0);  // (Arithmetic excetion) unchecked exception

        String str = "Cybertek";
       //  System.out.println( str.charAt(-1) ); // (index out of bound exception) unchecked exception

        int[] arr = {1,2,3};
        System.out.println(arr[200]);  // (Array index out of bound exception) unchecked exception

        System.out.println("Test Completed");  // after the exception occured, codes can not be executed



    }
}
