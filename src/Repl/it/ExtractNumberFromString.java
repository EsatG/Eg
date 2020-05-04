package Repl.it;

import java.util.Scanner;

public class ExtractNumberFromString {

    /*
    extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)
     */

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();

        String num =  extractNum(s);
        System.out.println(num);


    }

    public static String extractNum (String s){

        String num = "";

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){

                num += s.charAt(i);
            }
        }



        return  num;

    }














}
