package Repl.it;
import java.util.Scanner;
public class VendingMachine {
    /*
    Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.
Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickels

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:
Invalid price!

If itemPrice is not divisible by 5, then also display error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = input.nextInt();
        int change = 100 - itemPrice;
        int quarter = change / 25 ;
        int dime = (change % 25 ) / 10;
        int nickle = ((change % 25 ) % 10) / 5;
        boolean divisibleBy5 = itemPrice % 5 == 0;
        boolean price = itemPrice >= 25 && itemPrice <=100;


        if (price && divisibleBy5){
            System.out.println("Your change is " + quarter + " quarters " + dime + " dimes " + nickle + " nickles");

        } else {
            System.out.println("Invalid Price!");
        }
        







    }
}
