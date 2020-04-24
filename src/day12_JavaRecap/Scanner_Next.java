package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // String str=input.next();    // next() only takes the first word

       //  System.out.println(str);

        // 7921 Jones Branc Dr, Mclean VA,  22034

        String fullAddress = "";
        System.out.println("Enter the number of the building: ");
        short Bnumber = input.nextShort();
        fullAddress += Bnumber + " ";

        System.out.println("Enter the Street Name");
        String streetName = input.next();
        fullAddress += streetName + " ";

        System.out.println("Enter the type of the road");
        String roadType = input.next();
        fullAddress += roadType + ", ";

        System.out.println("Enter City Name, State, Zipcode");
        String cityName = input.next();
        fullAddress += cityName + " ";

        String State = input.next();
        fullAddress += State + ", ";

        String zipCode = input.next();

        fullAddress += zipCode;

        System.out.println("Your adress is: " + fullAddress);





    }
}
