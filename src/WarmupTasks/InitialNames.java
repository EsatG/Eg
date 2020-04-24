package WarmupTasks;

import java.util.Scanner;

public class InitialNames {
    public static void main(String[] args) {

        /*
         write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your second name:");
        String lastName = input.next();

        String initials = firstName.substring(0,1) + lastName.substring(0,1);
//      String initials = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();   also works
        initials = initials.toUpperCase();

      //  String initials = "" + firstName.charAt(0) + lastName.charAt(0);
      //  initials = initials.toUpperCase();



        System.out.println("Your initial is :" + initials);




    }




}
