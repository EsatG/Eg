package day44_Exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {

        try {
            System.out.println("Hello");
            System.out.println("Hola");
            System.out.println( 9/0 );
            System.out.println("Cybertek"); // not get executed
            System.out.println("Java");   // not get executed
        } catch (Exception e){

        }

        // if there is no exception it is nonsense to use try & catch block


    }
}
