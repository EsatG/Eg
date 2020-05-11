package Repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_FrontPiece {
    /*
    Given an int array of any length, print a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        //WRITE YOUR CODE HERE

        System.out.print("[");
        for(int i =0; i < size; i++) {
            if(i == 2)
                break;
            String splitter = "";
            if(i < size -1)
                splitter = ",";
            System.out.print(num[i]+splitter);
        }
        System.out.print("]");
/*
            if (size == 0){
                int [] arr = new int[0];
                System.out.println(Arrays.toString(arr));
            } else if (size == 1){
                int [] arr = new int[1];
                arr[0] = num[0];
                System.out.println(Arrays.toString(arr));
            } else {

            int [] arr = new int[2];
            arr [0] = num[0];
            arr [1] = num[1];
                System.out.println(Arrays.toString(arr));
            }

 */






    }
}
