package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {

        /*  valid credentials are:
            username: cybertek
            password: cybertekschool

            precondition : username and password can not be empty
                           if they are empty ==> please enter the credentials

        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUserName = input.nextLine();

        System.out.println("Enter your password");
        String inputUserPassword = input.nextLine();

        boolean logedIn = inputUserName.equals("Cybertek")  && inputUserPassword.equals("cybertekschool");
        boolean invalidUsername = ! inputUserName.equals("Cybertek") && inputUserPassword.equals("cybertekschool");
        boolean invalidPassword = inputUserName.equals("Cybertek") && ! inputUserPassword.equals("cybertekschool");

        if ( !inputUserName.isEmpty() && !inputUserPassword.isEmpty() ){    // username and password are not empty

            if (logedIn) {
                System.out.println("Logged in");

            } else if (invalidUsername){
                System.out.println("Password is correct, username is incorrect");
            }  else if (invalidPassword){
                System.out.println("Username is correct, password is incorrect");
            } else {
                System.out.println("Both username and password are incorrect");
            }
        } else {
            System.out.println("Please enter the credentials");

        }









    }
}
