package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {

        String [] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String [] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String [][] zoo = {wildAnimals, birds};

        String info = zoo [1][3]; // chicken
        System.out.println(info);

        System.out.println("=============================================================================");

        for (String eachbirds:zoo [1]){
            if(eachbirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachbirds);
        }

        System.out.println();

        for (String eachWild : zoo [0]){
            System.out.println(eachWild);
        }
        System.out.println(Arrays.deepToString(zoo));










    }
}
