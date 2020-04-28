package WarmupTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigits_fromString {
    public static void main(String[] args) {

        /*
        write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int sum = 0;

        for (int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57){
                sum += ch -48;
            }
        }
        System.out.println(sum);

        }







}
