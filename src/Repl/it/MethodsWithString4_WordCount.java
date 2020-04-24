package Repl.it;

import java.util.Arrays;

public class MethodsWithString4_WordCount {

    /*
    This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1
     */
    public static int wordCount(String words) {
         int count = 0;
        String[] wordofsentence =  words.split(" ");
        System.out.println(Arrays.toString(wordofsentence));

        for ( int i = wordofsentence.length-1; i >= 0; i--){
            if (wordofsentence[i].length() > 0) {
                count++;

            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "ali top     at";
        int num = wordCount(str);
        System.out.println(num);
    }








}
