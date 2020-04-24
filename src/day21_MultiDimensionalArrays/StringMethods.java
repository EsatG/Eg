package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Java";

        char [] chars = name.toCharArray();

        System.out.println(chars[0]);  // J
        System.out.println(chars[3]);   // a
         //   System.out.println(chars[4]);  // Index 4 out of bounds for length 4

        System.out.println("============================================================");

        String str = "I like Java";
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        /*
        reverse sentebce = day great is today
         */
        String sentence = "Today is great day";
        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        String result = "";

        for (int i = words.length-1; i >= 0; i-- ){
            String eachWords = words[i];
           // System.out.print(eachWords + " ");
            result += eachWords + " ";
        }
        System.out.println(result);

        String str2 = "ABCD";
        String [] arr2 = str2.split("");
        char [] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(arr2));  // return to string array
        System.out.println(Arrays.toString(ch2));   // return to char array






    }
}
