package day50_polymorphism;

public class ReferenceTypeCasting {
    /*
    Reference Type Casting: Upcasting & downcasting
           Pre-Condition: There HAS TO be "IS A" relationship
           upcasting: casting from sub class to super class(done by compiler automatically)
           downcasting: casting from super class to sub class(must be done by manually)
     */

    public static void main(String[] args) {

        int a = 100;
        double b = a; // implicitly done

        Dog dog = new Dog("Sam","M",2);

        Animal animal1 = dog; // upcasting, it is done implicitly

        Cat cat = new Cat("Nancy","F",1);
        // Dog dog2 = (dog) cat; error=> there has to be "IS A" relationship

        Animal animal2 = (Animal)cat; // we did upcasting manually it is not mandotory since it is occured by automatically

        System.out.println("==============================================================================");

        int x = 120;
        short y = (short)x; // explicit casting

        Animal animal3 = new Dog("Fex","M",6);

        Dog dog3 = (Dog) animal3; // downcasting, must be done manually

        Animal animal4 = new Cat("Gora","M",3);

        Cat cat2 = (Cat)animal4;

        System.out.println("=============================================================================");

        Animal animal5 = new Dog("Kaylie","F",2);

        Dog dog4 = (Dog)animal5;
        dog4.bark();
        // second way
        ((Dog)animal5).bark();











    }
}
