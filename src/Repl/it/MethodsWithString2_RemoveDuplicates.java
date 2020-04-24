package Repl.it;

import java.util.*;

public class MethodsWithString2_RemoveDuplicates {

    /*
    uniqueChars is a method that you will code now,
    should be able to accept any string in the world and
    return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"

     */

    public static void main(String[] args) {
        //test your code
        String Nondup = uniqueChars("BugBusters");
        System.out.println(Nondup);
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String result ="";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (!result.contains(ch+"")){
                result += ch;

            }
        }


    return result;
    }






}