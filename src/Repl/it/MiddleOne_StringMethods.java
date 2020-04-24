package Repl.it;

import java.util.Scanner;

public class MiddleOne_StringMethods {

    /*
    You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() >= 3 && word.length() % 2 != -0) {

            char midOdd = word.charAt(word.length() / 2);
            System.out.println(midOdd);
        } else if( word.length() == 1){
            String triple = word.concat(word).concat(word);
            System.out.println(triple);

        } else if ( word.length() >= 4 && word.length() % 2 == 0){
            String midEven = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
            System.out.println(midEven);

        } else if (word.length() == 2){
            String concat = word.concat(word);
            System.out.println(concat);
        }














    }
}
