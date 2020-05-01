package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        int maxNum = Collections.max(list);  // to find max number in arraylist
        System.out.println(maxNum);

        int minNum = Collections.min(list); // to find min number in arraylist
        System.out.println(minNum);

        /*
        1. write a prog that can return the second max number from arraylist
          Ex: {1,2,3,4,5,6,7,8,8};
               output : 7
        2. write a prog that can return the second min number from arraylist
          Ex: {1,1,2,3,4,5,6,7,8,8};
               output : 2
         */
        System.out.println("=============================================================");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));

        Integer max = Collections.max(numbers);

        numbers.removeAll(Arrays.asList(max));
        System.out.println(numbers);

        int secondMax = Collections.max(numbers);

        System.out.println(secondMax);

        System.out.println("==============================================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        Integer min = Collections.min(list2);

        list2.removeAll(Arrays.asList(min));

        System.out.println(list2);

        int secondMin = Collections.min(list2);
        System.out.println("Second minimum number is : " +  secondMin);

        System.out.println("===================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
                list3.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list3);

                Collections.swap(list3,0,4);  // swaps the positions of index 0 and index 4

        System.out.println(list3);   // {5,2,3,4,1}

        System.out.println("====================================================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer","Esat", "Dilber", "Gorgun", "Omer"));
/*
        names.set(0,"Cevdet");
        names.set(1,"Cevdet");
        names.set(5,"Cevdet");

 */
        Collections.replaceAll(names,"Omer","Cevdet");


        System.out.println(names);




















    }
}
