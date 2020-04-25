package Repl.it;

import java.time.LocalDate;
import java.util.Scanner;

public class CheckIfNumberIsPalindrome_VoidMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome (int num){


        String numStr = ""+num;
        int i = 0;
        int j = numStr.length() -1;

        boolean result2 = true;
        while(i<j)
        {
            if(numStr.charAt(i) != numStr.charAt(j))
            {
                result2 = false;
                break;
            }

            i++; j--;
        }
        System.out.println("first :"+result2);


        int temp = num;
        int remainder = 0;
        int result = 0;

        while ( num  > 0 ){
           remainder= num % 10;
           result = (result * 10) + remainder;
           num = num / 10;

        }
        if (result == temp){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }








}
