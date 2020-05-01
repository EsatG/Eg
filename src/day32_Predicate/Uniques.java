package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        // write a prog that can return the unique objects from an arraylist of characters

        Character [] chars = {'A','A','B','C','D','D'};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));

        System.out.println(charList);

        ArrayList<Character> result = new ArrayList<>(); // we will store unique objects into this arraylist
/*
        for (int i = 0; i < charList.size(); i ++){

            int count = Collections.frequency(charList,charList.get(i));
            if (count == 1){
                result.add(charList.get(i));
            }

        }

 */
        for (Character each : charList){

            int count = Collections.frequency(charList,each);
            if (count == 1){
                result.add(each);
            }

        }

        System.out.println(result);
















    }
}
