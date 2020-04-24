package day13_StringClass;
import java.util.Scanner;
public class ShippingAdress {
    public static void main(String[] args) {

        /*  write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102 */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter building number: ");
        String buildingNumber = input.next();

        input.nextLine();
        System.out.println("Enter street adress: ");
        String streetAdress = input.nextLine();

        System.out.println("Enter city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter state name: ");
        String stateName = input.nextLine();

        System.out.println("Enter zip code: ");
        String zipCode = input.next();

        input.nextLine();
        System.out.println("Enter full name of person: ");
        String nameOfPerson = input.nextLine();

        System.out.println("Ship to : " + nameOfPerson + "\n" + buildingNumber + " " + streetAdress + "\n" +
                cityName +", " + stateName + " " +zipCode);




    }

}
