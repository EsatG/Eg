package day14_StringClass;
import java.util.Scanner;
public class Credentials {
    public static void main(String[] args) {
        /*  userName: cybertek
            passWord:  cybertekschool
        */
        Scanner input = new Scanner(System.in);

        String validUserName = "cybertek";
        String validPassword = "cybertekschool";

        System.out.println("Enter your username");
        String inputUserName = input.next();

        System.out.println("Enter your password");
        String inputUserPassword = input.next();

        if(inputUserName.equals(validUserName) && inputUserPassword.equals(validPassword)) {

            System.out.println("Log in successfully");

        } else {
            System.out.println("Invalid credentials");
        }





    }
}
