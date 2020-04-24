package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String [] months = {"Jan", "Feb", "March", "April", "May", "June", "July","Aug", "Sep","Oct", "Nov", "Dec"};
                 //           0      1      2        3        4      5       6      7      8     9      10     11
        /*
        String [] months2 = new String[12];
        months2[0] = "Jan";

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int attempts = 1;

        while ( num > 12 || num <= 0){
            System.out.println("Invalid Entry, Please re-enter the number");
            num = input.nextInt();
            attempts++;

            if (attempts == 3 && (num > 12 || num <= 0)){
                System.out.println("Invalid Entry, you already attempted 3 times");
              System.exit(0);
            }
        }

        String result = months[num - 1];
        System.out.println(result);










    }
}
