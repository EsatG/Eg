package OfficeHours;

import java.util.Arrays;

public class Practice_04_15_2020 {
    public static void main(String[] args) {

        int a = 100;
        int [] arr = {100, 200,300};

        System.out.println(arr[1]);   // 200

        for (int i = 0; i < 3; i++){   // i : index number of elements

            int num = arr[i];
            System.out.println(num);
        }
        System.out.println("=======================================================================");
        int j = 0;
        while ( j < 3){
            int num = arr[j];
            System.out.println(num);
            j++;
        }
        System.out.println("===========================================================================");

        String [] names = {"John", "Aaron", "Luoise"};
        int length = names.length;
        String [] namesRev = new String[length];    // {null, null, null }

        /*  Reverse:
        namesRev [0] = names[2];
        namesRev [1] = names[1];
        namesRev [2] = names[0];
         System.out.println(Arrays.toString(namesRev));
         */


        int k = 2;
        for (int i = 0; i < length; i ++){
            namesRev[i] = names [k];
            k--;
        }
        System.out.println(Arrays.toString(namesRev));




    }
}
