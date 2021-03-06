package Repl.it;
import java.lang.reflect.Array;
import java.util.*;
public class FindTheMissingNumber {
    /*
    Create a method that takes an array of integers between 1 and 10 (excluding one number)
     and returns the missing number.
Examples
missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

missingNumber([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10

missingNumber([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7
Notes
The array of numbers will be unsorted (not in order).
Only one number will be missing.
     */

    public static void main(String[] args) {

        int [] arr = {1,3,5,2,6,7,10,4,8};
      int result =   missingNumber(arr);
        System.out.println(result);
    }

    public static int missingNumber(int[] arr){

        int sumTotal = (10 * 11) / 2;
        int sum = 0;
        int missing = 0;

               for (int i = 0; i < arr.length; i++){

                   sum += arr[i];
                   missing = sumTotal - sum;
               }


        return missing;
    }



}
