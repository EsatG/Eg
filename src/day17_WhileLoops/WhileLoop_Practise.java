package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoop_Practise {
    public static void main(String[] args) {
        /*
        ask the user to enter yes or no. If the user enters something other than yes or no,
        repeat the previous step
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter yes or no");
        String answer = input.next();

        boolean valid = answer.equalsIgnoreCase("yes" ) || answer.equalsIgnoreCase("no");

        while ( !valid ) {  // while the input is not yes or no, repeats the question
            System.out.println("Please re-enter");
            answer = input.next();

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") ) {
            break;
        }
        }
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Entered yes");
        }
        if (answer.equalsIgnoreCase("no")){
            System.out.println("Entered no");
        }




    }
}
