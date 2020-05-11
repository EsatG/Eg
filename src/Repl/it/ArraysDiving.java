package Repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDiving {
    /*
    In the sport of diving, seven judges award a score between 0 and 10,
    where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6
to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
     */

    public static void main(String[] args)
    {
        //WRITE YOUR CODES HERE

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter score for judge 1:");
        float j1 = sc.nextFloat();
        System.out.println("Enter score for judge 2:");
        float j2 = sc.nextFloat();
        System.out.println("Enter score for judge 3:");
        float j3 = sc.nextFloat();
        System.out.println("Enter score for judge 4:");
        float j4 = sc.nextFloat();
        System.out.println("Enter score for judge 5:");
        float j5 = sc.nextFloat();
        System.out.println("Enter score for judge 6:");
        float j6 = sc.nextFloat();
        System.out.println("Enter score for judge 7:");
        float j7 = sc.nextFloat();

        double [] arr = new double[7];
        arr [0] = j1;
        arr [1] = j2;
        arr [2] = j3;
        arr [3] = j4;
        arr [4] = j5;
        arr [5] = j6;
        arr [6] = j7;

        Arrays.sort(arr);

        double total = arr [1] +  arr [2] +  arr [3] +  arr [4] +  arr [5]  ;

        System.out.println("Enter difficulty:");
        double dif = sc.nextDouble();

        boolean difRange = dif >= 1.2 && dif <= 3.8;

        if (difRange){
            total = total * dif;
        } else {
            System.out.println("Difficulty is out of range");
            System.exit(0);
        }

        total = total * 0.6;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }










}
