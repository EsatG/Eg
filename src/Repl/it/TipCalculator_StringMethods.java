package Repl.it;

import java.util.Scanner;

public class TipCalculator_StringMethods {
    public static void main(String[] args) {

        /*
        Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Split or No split:");
        String split = input.next();

        System.out.println("Number of people:");
        byte nofpeople = input.nextByte();

        System.out.println("Check amount:");
        double amount = input.nextDouble();

        System.out.println("Service quality:");
        String serv_qua = input.next();

        String ppl = (nofpeople == 1) ? "&" : (nofpeople == 2) ? "&&" : (nofpeople == 3) ? "&&&" :
                (nofpeople == 4) ? "&&&&" :"&&&&&";


        double tip =0;

       if (serv_qua.equalsIgnoreCase("excellent")){
           tip = amount * 0.25;
       } else if (serv_qua.equalsIgnoreCase("great")){
           tip = amount * 0.2;
       } else if (serv_qua.equalsIgnoreCase("good")){
           tip = amount * 0.15;
       } else if (serv_qua.equalsIgnoreCase("fair")){
           tip = amount * 0.1;
       } else if (serv_qua.equalsIgnoreCase("poor")){
           tip = amount * 0.05;
       } else {
           tip = 0;
       }
        double TotalToPay = amount + tip;
        double amountPerPerson =TotalToPay / nofpeople;
        double TipPerPerson = tip / nofpeople;


        System.out.println("Number of people entered: " + ppl);
        System.out.println("Total to pay: " + TotalToPay);
        System.out.println("Total Tip: " + tip);
        System.out.println("Total per person: " + amountPerPerson);
        System.out.println("Tip per person: " + TipPerPerson);









    }
}
