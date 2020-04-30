package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,5,7));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list){
            if (!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("=========================================================================");

        /*
        write a prog that can remove the duplicates from an array of integer
              DO NOT USE for each loop
         */

        Integer [] arr1 = {1,1,2,2,3,3};

        ArrayList<Integer> nonDuplicates = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){
            if (!nonDuplicates.contains(arr1[i])){
                nonDuplicates.add(arr1[i]);
            }
        }
        System.out.println(nonDuplicates);











    }
}
