package WarmupTasks;


import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of minutes");
        int minutes = scan.nextInt();

        for ( int i = minutes; i >0; --i){
            if ( i < 0)
                break;
            for (int z = 59; z > 0; --z) {
                System.out.println((i - 1) + "minutes and " + z + " seconds left");
                sleep(1000);
            }
        }




    }
}
