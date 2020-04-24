package MyStudies;
import java.util.Scanner;
public class trying {
    public static void main(String[] args) {


       int x;
       for(x = 0; x <= 10; x++){
           System.out.print(x + " ");
       }
        System.out.println(x);

        System.out.println("==================================================");
            int a;
        for ( a = 0; a <= 10; a++){

            System.out.print("indent no: " + a + " ==>");
            for (int b = 0; b <= 10; b++){
                System.out.print(b + " ");

            }
            System.out.println();
        }
        System.out.println(a);




    }
}
