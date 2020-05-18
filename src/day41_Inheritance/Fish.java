package day41_Inheritance;

public class Fish extends Animal {

    public void swim(){
        System.out.println(name + " is swimming");
    }

    public static void main(String[] args) {

        Fish fish1 = new Fish();

        fish1.name = "Nemo";
        fish1.weight = 5.5;
        fish1.size = "Small";

        fish1.move();
        fish1.swim();

        System.out.println(fish1.name);
    }



}
