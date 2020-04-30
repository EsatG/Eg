package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {



        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,3,9,10,1,3));
        System.out.println(list1);
         /*
                    Integer a = 1;
                    list1.remove(a);  // removed first matching object (1)
                    list1.remove(a);

                    Integer b = 3;
                    list1.remove(b);
                    list1.remove(b);

          */

        list1.removeAll(Arrays.asList(3,1));  // to be removed any of the  matching object

        System.out.println(list1);
        System.out.println("========================================================================");

        String [] names = {"Ahmed", "Donald", "Barack", "Ahmed", "Omer"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        nameList.removeAll( Arrays.asList("Ahmed") );
        System.out.println(nameList);



        /*
        write a program that can remove duplicates fron an arraylist
         */












    }
}
