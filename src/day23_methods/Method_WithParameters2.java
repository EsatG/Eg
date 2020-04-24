package day23_methods;

public class Method_WithParameters2 {

    // create a function that can reverse any string
    // "Muhtar ==> rathuM

    public static void main(String[] args) {

        String names = "Esat";
        ReverseString(names);

        System.out.println();

        String name2 = "Cybertek School";
        ReverseString(name2);

    }

    public static void ReverseString (String str){

        for (int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }









}
