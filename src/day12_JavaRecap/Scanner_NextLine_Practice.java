package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_NextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 7925 JonesBranch Dr, Mclean VA, 22034

        System.out.println("Building Number: ");
        int Bnumber = input.nextInt();
        System.out.println("Building Number is: " + Bnumber);

        input.nextLine();
        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println("Street is: " + street);


        System.out.println("Zip Code: ");
        int zipcode = input.nextInt();

        input.nextLine();
        System.out.println("Enter the city name and seperated by comma and space: ");
        String cityState = input.nextLine();

        String fulladress = "Your adress is: " +Bnumber + " " + street + ", \n" + cityState + " " + zipcode;
        System.out.println(fulladress);

        input.close(); // closes the scanner



    }
}
