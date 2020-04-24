package day10_Switch_Scanner;
import java.util.Scanner;
public class rateCalculator {
    public static void main(String[] args) {

        /*   write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate

         */
                Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("How many hours do you work in a week ? : ");
        byte hours = input.nextByte();
        System.out.println("How many weeks do you work in a year ? : ");
        byte numberofWeeks = input.nextByte();

        int hourlyRate = (salary / numberofWeeks) / hours;
        System.out.println("Your hourly rate: " + hourlyRate);

    }
}
