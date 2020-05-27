package Repl.it;

import java.util.Arrays;

class PopulateArray {

    public static int[] populate(int[] r) {

    for(int i = 1; i <r.length; i++){
        r[0] =  1;
        r[i] = r[i-1] +1;

    }
    return r;
    }

    public static void main(String[] args) {

        int[] i = new int[8];
        i = populate(i);
        System.out.println(Arrays.toString(i));

    }


}