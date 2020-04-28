package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    /*
    1. create a list of Integers
    2. add 5 Integers to it
    3. return the max number from the list
          DO NOT USE ANY SORTING
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
                    list.add(100);
                    list.add(20);
                    list.add(300);
                    list.add(400);
                    list.add(50);
        int max = Integer.MIN_VALUE;

        for ( int i = 0; i < list.size(); i++){
            if (list.get(i)> max){
                max = list.get(i);
            }
        }
        System.out.println(max);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(2000);
        list2.add(300);


        int maximum = max(list2);
        System.out.println(maximum);

    }
    public static int max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;

        for ( int i = 0; i < list.size(); i++){
            if (list.get(i)> max){
                max = list.get(i);
            }
        }
        return max;
    }


}
