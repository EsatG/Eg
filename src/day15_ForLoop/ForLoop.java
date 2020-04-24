package day15_ForLoop;

public class ForLoop {
    public static void main(String[] args) {



       for ( int i =0; i < 5; i++ ) {
            System.out.println("Hello World");

        }
        System.out.println("======================================================================");
       /*
         write 1 to 10
        */

        for (int i = 1; i <= 10; i += 1) {
            System.out.println(i);
        }
        System.out.println("=======================================================");

        for (int i = 1; i <= 10; i += 1) {
            System.out.println(i + " : " + ( i * i));
        }







    }
}
