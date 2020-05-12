package day38_Constructors;

public class Dog {

    String name;
    String breed;
    int age;

    public Dog(){  // sets the default value for all instances
        name = "Unknown";
        breed = "Unknown";
        age = 0;
    }

    public Dog(String breed){
        this.breed = breed;
        name = "Unknown";
        age = 0;

    }

    public Dog(String breed,int age){
        this.breed = breed;
        this.age = age;
        name = "Unknown";

    }

    public String toString(){
        return "Name: " + name + ", Breed: " + breed + ", Age: " + age;
    }

}

class dogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        System.out.println(dog1.name);  // Unknown
        System.out.println(dog1.breed);  // Unknown
        System.out.println(dog1.age);   // 0

        System.out.println("=================================================");

        Dog dog2 = new Dog("Husky");

        System.out.println(dog2.name);  // Unknown
        System.out.println(dog2.breed); // Husky
        System.out.println(dog2.age);   // 0

        System.out.println("========================================================");

        Dog dog3 = new Dog("Poodle",4);

        System.out.println(dog3.name);
        System.out.println(dog3.breed);  // Poodle
        System.out.println(dog3.age);    // 4

        System.out.println("=======================================================");

        System.out.println(dog3);
        System.out.println(dog2);
        System.out.println(dog1);





    }
}
