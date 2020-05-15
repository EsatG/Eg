package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulations_Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        System.out.println(obj.getSSN()); // 0

        obj.setSSN(3456);
        System.out.println(obj.getSSN());


    }
}
