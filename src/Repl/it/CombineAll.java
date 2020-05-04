package Repl.it;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAll {
    /*
    Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1,
then add all the words (in order) from wordList2.  In other words, it is combining all the elements
from the two parameters.
     */

    public static void main(String[] args) {

      ArrayList<String> list1 = new ArrayList<>(Arrays.asList("omer","dilber"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("esat","gorgun","cevdet"));
        ArrayList<String> list = new ArrayList<>();

        combineAL(list1,list2);


    }
    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordlist2){

        ArrayList<String> list = new ArrayList<String>();
        list.addAll(wordList1);
        list.addAll(wordlist2);

        System.out.println(list);

        return list;
    }








}
