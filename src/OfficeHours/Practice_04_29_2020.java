package OfficeHours;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class Practice_04_29_2020 {
    public static void main(String[] args) {

        ArrayList<String> list2 = new ArrayList<>();
                    list2.add("A");
                    list2.add("B");
                    list2.add("C");
                    list2.add("D");

                    list2.add(2,"E");  // {A,B,E,C,D }

        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++){
            String str = list2.get(i);
            System.out.println(str);
        }
        System.out.println("=================================================================");

        for (String each: list2){
            System.out.println(each);

        }
        System.out.println("===================================================================");
        // list2 : {A,B,E,C,D };   want to replace C with F

        list2.set(3,"F");
        System.out.println(list2);

        System.out.println("============================================================");

        // list2 : {A,B,E,F,D };   want to remove "F"

        list2.remove(3);
        System.out.println(list2);

        boolean r1 = list2.remove("A");  // returns as a boolean
        System.out.println(list2);
        System.out.println(r1);

        boolean r2 = list2.remove("Z");  // false
        System.out.println(r2);

        System.out.println(list2.size());

        list2.clear();
        System.out.println(list2);   // size : 0

        System.out.println("=========================================================================");

        // indexOf(Object) =>> returns the index number

        ArrayList<Character> list3 = new ArrayList<>();

                        list3.add('A');
                        list3.add('B');
                        list3.add('C');
                        list3.add('D');
                        list3.add('C');

                        int indexNum = list3.indexOf('C');
                        int indexNum2 = list3.indexOf('c');   // -1.. because c does not exist in the list
        System.out.println(indexNum);
        System.out.println(indexNum2);

        int lastindexNum = list3.lastIndexOf('C');
        System.out.println(lastindexNum);

        System.out.println(list3);

        Character ch1 = 'C';
        // list3.remove(ch1);  remove the first C

        list3.remove(list3.lastIndexOf('C'));
        System.out.println(list3);

        System.out.println("=============================================================");

        // combining two arrays into list

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10,11,12,13};

        ArrayList<Integer> list4 = new ArrayList<>();
        for (int each : arr1) {   // each element of arr1
            list4.add(each);
        }
        for (int each : arr2) {   // each element of arr2
            list4.add(each);
        }
        System.out.println(list4);






    }
}
