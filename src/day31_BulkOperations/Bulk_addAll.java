package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

      //   list1.addAll(Arrays.asList(30,20,40,50,45,35,200));

        Integer [] arr1 = {30,20,40,50,45,35,200};
        list1.addAll(Arrays.asList(arr1));

        System.out.println("=========================================================");

        String [] names = {"Esat", "Omer Cevdet", "Dilber", "Sabri" , "Huseyin"};

       // names [5] = "Osman";  // it gives exception since out of bound..Because array's size is static

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

        nameList.add("Sulbiye"); //  we can add another object since arraylist's size is dynamic
        nameList.remove("sulbiye"); // not removed since java is case sensitive
        System.out.println(nameList);

        System.out.println("=====================================================================");

        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        // ArrayList<Integer> numList = new ArrayList<>(Collection Type);

        System.out.println(numList);



        System.out.println();









    }
}
