package Repl.it;


import java.util.Arrays;

public class CombineToFullName {

    public static String[] combineNames(String[] first_names, String[] last_names)
    {
       String [] combine = new String[first_names.length];
       for (int i = 0; i < first_names.length; i++){
          combine[i] =  first_names[i] + " " + last_names[i];
       }
       return combine;
    }

    public static void main(String[] args)
    {
        //feel free to test code here
        String [] names = {"Esat", "Bahri"};
        String [] last = {"Gorgun", "Turel"};
        String [] result ;
        result =  combineNames(names,last);
        System.out.println(Arrays.toString(result));
    }
}
