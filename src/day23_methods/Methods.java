package day23_methods;

public class Methods {

    /*
    Access-modifier   specifier    return type   methodName {
                     statements;
           }

     */

    public static void main(String[] args) {


        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch 18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();

        System.out.println("================================================================================");

        evenNumbers1_100();
        System.out.println();
        OddNumbers1_100();


    }
    public  static void printHello5() {
        for (int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }
    }

    public static void evenNumbers1_100(){

        for (int i = 1; i <= 100; i++){
            if ( i % 2 == 0 ){
                System.out.print(i + " ");
            }
        }
    }

    public  static void OddNumbers1_100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }



    }




}
