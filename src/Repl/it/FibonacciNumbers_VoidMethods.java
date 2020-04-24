package Repl.it;
import java.util.*;
public class FibonacciNumbers_VoidMethods {

    /*
    Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers
 for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
 The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        if (num < 2) {
            System.out.println(num);
        }
        else
        {
            int previous2 = 0;                   // fib0
            int previous1 = 1;                   // fib1
            int current = previous1 + previous2; // fib2

            int i = 2;
            while( i++ < num)
            {
                int temp = current;
                current = current + previous1;
                previous1 = temp;
            }
            System.out.println(current);
        }
        int fib2 = 1 + 0;
        int fib3 = 1 + 1;      // fib2 + fib1
        int fib4 = 2 + 1;      // fib3 + fib2
        int fib5 = 3 + 2;      // fib4 + fib3
        int fib6 = 5 + 3;      // fib5 + fib4
        int fib7 = 8 + 5;     // fib6 + fib5
        int fib8 = 13 + 8;    // fib7 + fib6
        int fib9 = 21 + 13;   // fib8 + fib7
    }






}


