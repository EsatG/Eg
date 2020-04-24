package day11_Scanner;
import java.util.Scanner;
public class nextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = input.nextByte();  // age + Enter
        System.out.println("Your age is: " + age);

        input.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Your full name: " + fullName);




    }
}
