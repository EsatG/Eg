package day19_Arrays;

import java.util.Scanner;

public class Uniques {
    public static void main(String[] args) {

        /*
        1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.next();


        String result = "";   // B

        for (int j =0; j <= str.length() - 1; j++){

            int count = 0;     // to count to occurance of the character
            for (int i = 0; i <= str.length() - 1; i++){

                if (str.charAt(i) == str.charAt(j)){     // check how many times the character is occured in the string
                    count++;
                }

            }
            if(count == 1){     // if unique
                result += str.charAt(j);
            }
        }
        System.out.println(result);









    }
}
