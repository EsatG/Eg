package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

      String [] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = input.nextInt();

        if (num > 7 || num < 1){
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        String result = days [num - 1];
        System.out.println(result);






    }
}
