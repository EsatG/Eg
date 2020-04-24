package day25_MethodsRecap;

public class return_statement {

    public static void main(String[] args) {

        /*
        if ( 10 > 9){
            return;   // exits the current method only
        }
        System.out.println("Hello");   // not to be executed

         */
        method1();

        System.out.println("Hello");   // will be printed out

        method2();
    }
    public static void method1 (){
        if ( 10 > 9){

            return;

        }
        System.out.println("Hello Cybertek");  // not to be printed out
    }



    public static void method2 (){
        if ( 10 > 9){
           System.exit(0);   // exit entire prog

        }
        System.out.println("Hello Cybertek");  // not to be printed out
    }










}
