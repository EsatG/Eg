package Repl.it;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodsWithArrayList_Swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
    {

        Collections.swap(list,pos1,pos2);
        System.out.println(list);

     return list;
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("one","two","three"));
        swap(list,0,2);


    }//end main
}
