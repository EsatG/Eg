package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {

        Carpet [] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(4,5,15,false);
        carpets[2].customOrder(9,5.5,30,true);
        carpets[3].customOrder(14,15,49.99,false);
        carpets[4].customOrder(5,4.8,25,true);

        System.out.println(carpets[0] + "\n");
        System.out.println(carpets[1] + "\n");
        System.out.println(carpets[2] + "\n");
        System.out.println(carpets[3] + "\n");
        System.out.println(carpets[4]);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        for (Carpet each: carpets){
            if(each.isPersian){
                persianCarpets.add(each);
            }
        }
        System.out.println("There are " + persianCarpets.size() + " persian carpets\n");

        System.out.println( persianCarpets.get(0) + "\n" );
        System.out.println(persianCarpets.get(1).calcCost() + "\n");

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));

        regularCarpets.removeIf(p-> p.isPersian);

        System.out.println("There are " + regularCarpets.size() + " regular carpets\n");

        for(int i = 0; i < regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i).calcCost() + "\n" );
        }











    }
}
