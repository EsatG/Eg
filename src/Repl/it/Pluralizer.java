package Repl.it;

import java.util.Scanner;

public class Pluralizer {

    /*
     Two horses. Five monkeys. Twenty flies. One cat. Nine lives.
     Despite the English language being one of the most commonly used languages around the world,
     it is also quite complicated to learn if you are not a native speaker.
     Taking a noun and converting it to its plural form has a dozen rules and even more special cases.

   In this project, you will be creating a program that takes a given non-negative integer and
   a given singular noun as a String.  You will have to print out the number,
   followed by the string in its plural form (unless the number is 1).

     */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:

        String plural = "";

        if(amt == 1){
            plural += amt + " " + word;
        } else if (word.endsWith("h")) {
            plural += amt + " " + word + "es";

        } else if(word.endsWith("uy") || word.endsWith("oy")) {
                plural += amt + " " + word + "s";


        } else if(word.endsWith("ay")){

            plural += amt + " " + word + "s";

        } else if(word.endsWith("us")){
            word = word.substring(0,word.length()-2);
            plural += amt + " " + word + "i";
        } else if (word.endsWith("fe")){
            word = word.substring(0,word.length()-2);
            plural += amt + " " + word + "ves";
        }

        else if (word.endsWith("y")){
           word = word.substring(0,word.length()-1);

            plural += amt + " " + word + "ies";

        }  else {

            plural += amt + " " + word + "s";
        }

        System.out.println(plural);




    }


}
