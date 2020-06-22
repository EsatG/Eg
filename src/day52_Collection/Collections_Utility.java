package day52_Collection;

import java.util.*;

public class Collections_Utility {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(9,5,3,11,8,0,7,9));
        Collections.sort(list1);

        System.out.println(list1);
        System.out.println("===========================================================================");

        // 1. write a prog that can remove the duplicates from arraylist and print out in sorted order

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5,5,6,3,8,1,3,7,7,4,0,3,0));

        nums = new ArrayList<>( new TreeSet<>(nums) ); // TreeSet removes duplicates and sort data members in ascending order by default

        System.out.println(nums);

        System.out.println("=============================================================");
        // write a program that can removed the duplicates from an arraylist. DO NOT change the order
        // [6,6,6,6,5,5,5,4,4,4,4] ==> [6,5,4]

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));
        list = new ArrayList<>( new LinkedHashSet<>(list) );  // LinkedHashSet remove the duplicated ones by default

        System.out.println(list);

        System.out.println("===============================================================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Esat","Omer","Esat","Dilber","Omer","Cevdet","Omer","Dilber"));

        boolean result = Collections.frequency(names,"Dilber") == 1;

        System.out.println(result);





    }

}
