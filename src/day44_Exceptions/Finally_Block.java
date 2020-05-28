package day44_Exceptions;

public class Finally_Block {
    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);  // every unexpected exception it is gonna jump to catch block
            System.out.println("Try Block");
        } catch (Exception e){
            System.out.println("Catch Block");

        } finally {
            System.out.println("Finally");  // it is always get executed regardless of exception was handled or not
        }                                   // we can NOT apply without try & catch block


    }



}
