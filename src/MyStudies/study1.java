package MyStudies;



public class study1 {

    public static void main(String[] args) {

        //creating a string by java string literal
        String str = "Beginnersbook";

        char arrch[]={'h','e','l','l','o'};
        char [] arr = {'E','s','a','t'};

        //converting char array arrch[] to string str2
        String str2 = new String(arrch);
        String str4 = new String(arr);

        //creating another java string str3 by using new keyword
        String str3 = new String("Java String Example");

        //Displaying all the three strings
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("==============================================");

        String s = "A";
        String s2 = "A";

        String y = "B";
        String z = "B";
        String x = "B";
        x = "C";

        int a = 1;
        a = 2;
        int b = 1;
        int c = 1;


        System.out.println("s: " + s);
        System.out.println("s2: " + s2);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}
