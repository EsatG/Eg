package Repl.it;

import java.util.Arrays;

public class SwitchElements {

    public static int[] do_switch(int[] i){

      int a = i[0];

      i[0] = i[i.length-1];
      i [i.length-1] = a;

        return i;

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] result = do_switch(arr);
        System.out.println(Arrays.toString(result));
    }
}

