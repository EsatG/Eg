package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods {

    /*
    contains (Object) : returns as boolean
    equals(ArrayListName) : compares two arraylist
    isEmpty() : returns as boolean, depending on the size. Size =0 =>> true

    sorting arraylist :
               Collections.sort(ArrayListName); =>> Ascending order
               Collections is presented in "java.util" package
                  import.packageName.className; =>> import jacva.util.Collections;

    Data Structers:
             1. Array =>> Arrays (java.util)
             2. Collection =>> Collections (java.util)
             3. Maps
     */

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
                    list1.add("A");
                    list1.add("B");
                    list1.add("C");
                    list1.add("D");

            boolean r1 = list1.contains("Z");   // false
        System.out.println(r1);

        ArrayList<String> list2 = new ArrayList<>();
                    list2.add("A");
                    list2.add("C");
                    list2.add("B");
                    list2.add("D");

        Collections.sort(list1);   // list1: [A,B,C,D]
        Collections.sort(list2);   // list2: [A,B,C,D]

        boolean r2 = list1.equals(list2);   // true
        System.out.println(r2);

        // Arrays.equals(arr1,arr2)

        int [] arr1 = {1,2,3};
        int [] arr2 = {3,2,1};

        boolean r3 = Arrays.equals(arr1,arr2);  // false since order of objects are different
        System.out.println(r3);

        System.out.println("===============================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
                    list3.add(10);
                    list3.add(100);
                    list3.add(1000);
                    list3.add(20);
        Collections.sort(list3);

        System.out.println(list3);

        ArrayList<Integer> reversedList3 = new ArrayList<>();

        for (int i = list3.size()-1; i >= 0; i--){
           //  System.out.print(list3.get(i) + " ");
            reversedList3.add(list3.get(i));
        }
        System.out.println(reversedList3);

        list3 = reversedList3;  // we can  assign one ArrayList to another ArrayList
        System.out.println(list3);

        System.out.println(list3.size());

        boolean r4 = list3.isEmpty(); // false
        System.out.println(r4);

        list3.clear();
        boolean r5 = list3.isEmpty();  // true
        System.out.println(r5);























    }
}
