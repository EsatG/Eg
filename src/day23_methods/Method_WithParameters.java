package day23_methods;

import java.util.Scanner;

public class Method_WithParameters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();

        EligibleToBuyAlcohol(age);   // (17) is argument

    }

    public static void EligibleToBuyAlcohol( byte age){    // (int age) is parameter

        if ( age >= 21){
            System.out.println("Eligible to buy alcohol");
        } else{
            System.out.println("Eligible to buy milk");
        }

    }













}
