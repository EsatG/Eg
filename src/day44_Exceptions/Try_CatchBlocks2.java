package day44_Exceptions;

public class Try_CatchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            Thread.sleep(10000);
            System.out.println("Try block");
        }catch (Exception e){
            System.out.println("Catch Block");


        }

        System.out.println("World");
    }
}
