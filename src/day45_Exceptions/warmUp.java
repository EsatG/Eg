package day45_Exceptions;

public class warmUp {

    public static void main(String[] args) {

        int pushup = 0;
        while (pushup < 20){
            System.out.println("Pushup" + (pushup + 1));
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }

            pushup++;
        }

    }
}
