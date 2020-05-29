package day45_Exceptions;

public class ThrowsKeyword {

    /*
    "throws" keyword for checked exceptions
     cheaper way but it has disadvantage ( exception did not handle just was thrown)
     better to use if you will not call that method to another class
     the caller of the method is responsible for handling the exception
     MUST be used in method signature after the parameter
     indicates that the methods throws an exception
     */

    public static void sleep1() {

    try {
        Thread.sleep(3000);
    }catch (Exception e){

    }

    }

    public static void sleep2() throws  InterruptedException {

        Thread.sleep(1000);

    }

    public static void main(String[] args) throws InterruptedException{

        System.out.println("Cybertek");

        sleep2();
        System.out.println("Java");
    }

    public static void method1() throws Exception{

        String [] arr = {"A"};
        main(arr);

    }

    public static void method2(){
        try {
            method1();
        } catch (Exception e){

        }
    }

}
