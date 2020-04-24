package MyStudies;

import java.util.Arrays;

public class DescendingOrder {
    /*
     create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1
     */

    public static void main(String[] args) {
     int [] arr = {2,0,4,3,1,5};

     Descending(arr);


    }

    public static void Descending (int [] arr){

        Arrays.sort(arr);
        int [] Revarr = new int[arr.length];
        int j = arr.length-1;
        for ( int i = 0; i < arr.length; i++){
            Revarr [j] = arr[i];
            j--;

        }
        System.out.println(Arrays.toString(Revarr));


    }







}
