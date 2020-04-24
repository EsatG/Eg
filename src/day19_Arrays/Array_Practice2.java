package day19_Arrays;

import java.util.Scanner;

public class Array_Practice2 {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30};
        System.out.println(arr.length);

        int [] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String Testers [] = new String[3];  // {"Reem" , "Madina" , "Osman"};
                 // index: 0,1,2
        Testers[0] = "Reem";
        Testers[2] = "Osman";
        System.out.println(Testers[0]);
        System.out.println(Testers[1]);    // null==> default of string or any object
        System.out.println(Testers[2]);

        System.out.println(Testers.length);   // 3

        System.out.println("=====================================================================================");

        Scanner input = new Scanner(System.in);

        String [] students = new String[10];    // legth of array

        // write a prog that asks "enter a name" 10 times, and store each of the names in the array students

        

    }
}
