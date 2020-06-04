package OfficeHours.day5_ArraysAndArraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingNumbers {

    public static int sumElements(int [] arr){

        int sum = 0;

        for(int i =0; i < arr.length; i++){

            sum += arr[i];
        }
        return sum;
    }

    public static int sumElements(ArrayList<Integer> list){

        int sum = 0;

        for(int i =0; i < list.size(); i++){

            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        System.out.println(sumElements(a));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,12));
        System.out.println(sumElements(list));
    }


}
