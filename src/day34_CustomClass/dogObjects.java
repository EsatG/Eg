package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky","Small",4,"White","Ghost");

    /*
        dog1.breed = "Husky";
        dog1.size = "Small";
        dog1.color = "White";
        dog1.name = "Ghost";
        dog1.age = 4;

        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);

     */

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay","Extra big",5,"Brown","Ajdar");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"Grey","Zagor");

        System.out.println(dog1 + "\n");
        System.out.println(dog2 + "\n");
        System.out.println(dog3 );

        System.out.println("=============================================================================");

        ArrayList<Dog> dogs = new ArrayList<>(Arrays.asList(dog1,dog2,dog3));

        for(int i = 0; i < dogs.size(); i++){
            Dog eachDog = dogs.get(i);
            System.out.println(eachDog);

        }

        System.out.println("===========================================================================");

        dogs.removeIf(p-> p.age > 2);

        for(int i = 0; i < dogs.size(); i++){
            Dog eachDog = dogs.get(i);
            System.out.println(eachDog);

        }










    }
}
