package Repl.it;

import java.util.ArrayList;
import java.util.Arrays;

public class appendPosSum {
    /*
    Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
The original ArrayList should remain unchanged.
     */
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-1,2,4,-3,0,3));


        System.out.println(appendPosSum(list1));






    }

    // create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.size(); i ++){
            if (nums.get(i) > 0 ){
                list.add(nums.get(i));

            }
        }

        Integer result = 0;
        for (Integer each : list){
            result += each;

        }
        list.add(result);


        return list;
    }










}
