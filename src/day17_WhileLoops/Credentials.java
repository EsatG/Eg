package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        /*
        user : cybertek
        password : cybertek123
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name");
        String username = input.next();

        System.out.println("Enter password");
        String password = input.next();

        boolean valid = (username.equals("cybertek") && password.equals("cybertek123"));

        int count = 1;
        while (! valid){
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter user name");
            username = input.next();

            System.out.println("Enter password");
            password = input.next();
            valid = (username.equals("cybertek") && password.equals("cybertek123"));

            count++;
            if (count == 3){
                System.out.println("Your account is locked");
                break;
            }

        }
        if (valid){
            System.out.println("Logged in");

        }













    }
}
