package day18_nestedLoops;

public class do_while_practice {
    public static void main(String[] args) {

        /*
        print all the even number 0 ~ 100 in the same line seperated by a space
         */

        int num = 1;
        do {
            if ( num % 2 != 0) {

                System.out.print(num + " ");

            }
            num++;
        } while ( num <= 100);

        System.out.println();
        System.out.println("=======================================================================");

        int z = 1;
        do {
            System.out.println(z);
            if (z == 2){
                break;
            }
            z++;
        } while ( z<= 5);

        System.out.println("================================================================");

        int y = 1;
        do {
            if ( y== 3){
                y++;     // need to make sure that the iterator is not skipping, so that the condition will eventually be false
                continue;
            }
            System.out.println(y);
            y++;
        } while ( y <= 5);

        System.out.println("==========================================================================");

        int t = 1;
        do{
            if ( t % 2 != 0){
                t++;
                continue;
            }
            System.out.print(t + " ");
            t++;
        }while( t <= 100);


    }
}
