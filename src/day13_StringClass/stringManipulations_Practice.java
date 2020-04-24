package day13_StringClass;
import java.util.Scanner;
public class stringManipulations_Practice {
    public static void main(String[] args) {

        /*  input : cyBertek sChool
        output : Cybertek
                 School
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullname = input.nextLine();

        String firstname = fullname.substring(0, fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" ") + 1);

        firstname = firstname.substring(0,1).toUpperCase()+ firstname.substring(1).toLowerCase();

        System.out.println("Your first name is " + firstname );
        System.out.println("Your last name is " + lastname);









    }
}
