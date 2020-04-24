package day10_Switch_Scanner;

import java.util.Scanner;

public class Numbers_scanner {

    /* Write a program that asks user to enter three numbers, print out the maximum and minimum number */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // object of scanner

        System.out.println("Enter First Number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter Third Number: ");
        int num3 = scan.nextInt();

        int max = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >=num1 && num2 >= num3) ? num2 :num3;

        int min = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <=num1 && num2 <= num3) ? num2 :num3;

        System.out.println("Maximum Number is: " + max);
        System.out.println("Minimum Number is: " + min);






    }
}
