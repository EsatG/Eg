package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {


        String str = "ey edip adanada pide ye";

        String reversedStr = "";

        int index = str.length() - 1;   // last index number

        while ( index >= 0) {
           reversedStr += str.charAt(index);
            index--;
        }
       boolean palindrome = reversedStr.equalsIgnoreCase(str);
        System.out.println(palindrome);





    }
}