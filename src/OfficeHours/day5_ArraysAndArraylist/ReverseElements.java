package OfficeHours.day5_ArraysAndArraylist;

public class ReverseElements {

    public static int[] reverse(int [] arr){

        // 1,3,2,4 =>> 4,2,3,1

        for(int i = 0; i < arr.length; i++){

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        return arr;
    }
}
