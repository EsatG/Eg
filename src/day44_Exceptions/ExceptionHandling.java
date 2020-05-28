package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(100));
        }catch (RuntimeException e){
            String description = e.getMessage(); // getMessage => getting a brief description of that exception
            System.out.println(description);

        }
        System.out.println("================================================================");



        try {
            System.out.println( 100 / 0 );
            System.out.println("Try block");  // not executed because it directly jumps to catch block in unexpected exception
        }catch (RuntimeException e){
            System.out.println("Catch block");
            String desc = e.getMessage();
            System.out.println(desc);

        }

        System.out.println("Completed");
    }
}
