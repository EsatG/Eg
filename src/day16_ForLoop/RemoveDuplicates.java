package day16_ForLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();


    String result = "";  // we store the expected result in this variable

    for ( int i = 0; i <= str.length() - 1; i++ ){

        if ( result.contains("" + str.charAt(i) )) {   // i is the index number
            continue;
        }
        result += str.charAt(i);   // only gets executed if str.charAt(i) is not contained in the result
    }
        System.out.println(result);


    }

}
