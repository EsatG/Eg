package day14_StringClass;

import java.util.Scanner;

public class Checkwords {
    public static void main(String[] args) {

        /* Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
      */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 =input.next();

        System.out.println("Enter second word");
        String word2 =input.next();

        System.out.println("Enter third word");
        String word3 =input.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        boolean allEquals = length1 == length2 && length2 == length3;
        boolean allDifferent = length1 != length2 && length2 != length3 && length2 != length3;

        if(allEquals) {
            System.out.println("All words are same length");
        } else if (allDifferent) {
            System.out.println("All words are different");
        } else {
            System.out.println("not same nor different");
        }






    }


}
