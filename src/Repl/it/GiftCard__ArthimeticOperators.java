package Repl.it;

import java.util.Scanner;

public class GiftCard__ArthimeticOperators {
    public static void main(String[] args) {
        /*
        Let's say I've got a 100$ gift card and you want to buy something in your online store .
        Write a program that will help me to buy something and display leftover balance after purchase.
        If item is not in the list, display message: "Invalid item!".
        If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!


         */
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        int smartphone = 300;
        int laptop = 400;
        int charger = 15;
        int usbCable = 10;
        int Headphones = 30;
        int pants = 50;
        int hat = 25;
        int socks = 5;
        int Blanket = 60;
        int pillow = 40;

        int result;


         if (item.equalsIgnoreCase("smartphone") || item.equalsIgnoreCase("laptop")){
            System.out.printf("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("charger")){
             result = 100 - charger;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         } else if (item.equalsIgnoreCase("usbcable")){
             result = 100 - usbCable;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         } else if (item.equalsIgnoreCase("headphones")){
             result = 100 - Headphones;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         } else if (item.equalsIgnoreCase("charger")){
             result = 100 - charger;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         } else if (item.equalsIgnoreCase("pants")){
             result = 100 - pants;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         } else if (item.equalsIgnoreCase("hat")) {
             result = 100 - hat;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         } else if (item.equalsIgnoreCase("socks")) {
             result = 100 - socks;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         } else if (item.equalsIgnoreCase("blanket")) {
             result = 100 - Blanket;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         } else if (item.equalsIgnoreCase("pillow")) {
             result = 100 - pillow;
             System.out.println("Thank you for your purchase!");
             System.out.println("Your current balance is: " + result);
         }  else {
             System.out.println("Invalid Item!");
         }










    }
}
