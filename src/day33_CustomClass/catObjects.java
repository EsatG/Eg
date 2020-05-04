package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.setCatInfo("Scottish","White",2,"Tente");

       //  System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.setCatInfo("Siemes","Brown",1,"Garfield");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Van","Black",3,"Kedicik");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        for (int i = 0; i < catList.size(); i++){
            System.out.println(catList.get(i));
        }

        System.out.println("=======================================================================");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("=============================================================");

        cat1.eat("cat treats");
        cat2.eat("Fish");
        cat3.eat("Sish kabab");

        System.out.println("=========================================================================");

        cat1.drink("water");
        cat2.drink("coffee");
        cat3.drink("Milk");







    }
}
