package day44_Exceptions;

public class Practice2 {

    public static void main(String[] args) {

        System.out.println("Hello");
        waits(5);
        System.out.println("World");

    }


    public static void waits(double seconds){
        try {
            Thread.sleep((long)(seconds * 1000) ); // makes the current execution thread to wait for specific amount of time
        }catch (Exception e){ }

    }

}
