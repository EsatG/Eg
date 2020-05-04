package Repl.it;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In: ");
        String word = inp.nextLine();


        String result = "";

        for (int i = 0; i < word.length(); i++){
            boolean vowels = word.substring(i,i+1).equalsIgnoreCase("a") ||
                             word.substring(i,i+1).equalsIgnoreCase("e") ||
                             word.substring(i,i+1).equalsIgnoreCase("i") ||
                             word.substring(i,i+1).equalsIgnoreCase("o") ||
                             word.substring(i,i+1).equalsIgnoreCase("u");

            if (vowels){
                result += word.substring(i,i+1);
            }

        }
        System.out.println(result);










    }
}
