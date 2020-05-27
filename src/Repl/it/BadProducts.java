package Repl.it;

public class BadProducts {

    public static boolean badP(int[] products,int limit)
    {
        int count = 0;
        for (int each : products){
            if(each == 0){
                count++;
            }
        }

        if(count < limit){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int [] r = {1,0,1,1,0};

        boolean result = badP(r,3);
        System.out.println(result);
    }


}


