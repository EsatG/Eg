package Repl.it;

import java.util.Scanner;

public class ShoppingList2_Scanner {

    public static void main(String[] args) {

        /*
        In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or
ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count,
price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3

-Create a Scanner object named scan.

Execution flow using with example:

Use scanner to read all 3 values.

-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)


-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)


-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)


-calculate totalPrice for all items only if the item's count is more than 0!

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Item1, count and it's price: ");
        String item1 = input.next();
        int countOfItem1 = input.nextInt();
        double priceOfItem1 = input.nextDouble();

        System.out.println("Enter Item2, count and it's price:");
        String item2 = input.next();
        int countOfItem2 = input.nextInt();
        double priceOfItem2 = input.nextDouble();

        System.out.println("Enter Item3, count and it's price:");
        String item3 = input.next();
        int countOfItem3 = input.nextInt();
        double priceOfItem3 = input.nextDouble();

        double price1 = priceOfItem1 * countOfItem1;
        double price2 = priceOfItem2 * countOfItem2;
        double price3 = priceOfItem3 * countOfItem3;
        double totalPrice = price1 + price2 + price3;

        if ( countOfItem1 > 0) {
            System.out.println("Item1: " +item1 +" Price: " +price1 +", ");
        }
        if ( countOfItem2 > 0) {
            System.out.println("Item2: " + item2 + " Price: " + price2);
        }
        if (countOfItem3 > 0){
            System.out.println("Item3: " + item3 + " Price: " + price3);
        }
        String report = "Total price: " + totalPrice;
        System.out.println(report);








    }
}
