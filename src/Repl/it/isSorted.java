package Repl.it;

import java.util.Arrays;

public class isSorted {
    public static boolean isSort(int[] nums) {

      for(int i = 0; i < nums.length - 1; i++){
          if (nums[i ] > nums[i+1]){
              return false;
          }
      }
       return true;
    }
    public static void main(String[] args) {

        int [] numbers = {4,2,6,-1,8,3};
        int [] nums = {1,2,3,4};
        System.out.println(isSort(nums));
    }














}
