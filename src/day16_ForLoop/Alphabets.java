package day16_ForLoop;

import java.sql.PreparedStatement;

public class Alphabets {
    public static void main(String[] args) {

        String upperCase = "";   // A~Z
        String lowerCase="";     // a ~ z

        for ( char ch = 'A'; ch <= 'Z' ; ch++){
            upperCase += ch;
        }
        System.out.println(upperCase);

        for (char ch = 'a' ; ch <= 'z' ; ch++){
            lowerCase += ch;
        }
        System.out.println(lowerCase);

        String result ="";

        for ( int i = 0; i <= upperCase.length() - 1; i++){
            result += upperCase.charAt(i) + ""+ lowerCase.charAt(i) + " ";
        }
        System.out.println(result);

        // SECOND SOLUTION ==>

        int a = 97;   // a= 97 in ascii table
        int A = 65;   // A= 65 in ascii table

        String result2 = "";
        for (int i = 0; i < 26 ; i++){
            char ch = (char) (A + i);    // upper case characters
            char ch1 = (char) ( a + i);  // lower case characters

            result2 += ch + "" + ch1 + " ";
        }
        System.out.println(result2);







    }
}
