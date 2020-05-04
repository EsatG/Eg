package Repl.it;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListTwoTimes {

    /*
    Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of
the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,7));

        twoTimes(list);


    }

    public static ArrayList<Integer> twoTimes (ArrayList<Integer> nums){

        ArrayList<Integer> twice = new ArrayList<>();
        for (Integer each : nums ){
            twice.add(each);
            twice.add(each);
        }
        System.out.println(twice);
        return  twice;
    }











}
