package day19_Arrays;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        /*
        write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
         */
        Scanner input = new Scanner(System.in);
        String str = input.next();

        String result = "";

        String nonDup = "";   // ABC

        for(int i = 0; i <= str.length() - 1; i++){
            if ( !nonDup.contains("" + str.charAt(i)) ){
                nonDup += str.charAt(i);
            }
        }

        for (int j = 0; j <= nonDup.length() -1; j++){

           //  nonDup.charAt(j);


            int count = 0;   // count the total number of occurance of each character from str
            for( int i = 0; i <= str.length()- 1; i++){
                if(str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            result += nonDup.charAt(j) + "" + count;
        }   



        System.out.println(result);




    }
}
