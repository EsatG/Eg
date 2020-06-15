package day50_polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog obj1 = new Dog("Zagor","M",3);
        System.out.println(obj1.dogName);
        obj1.bark();

        Animal obj2 = new Dog("Kito","F",4);
        // System.out.println(obj2.dogName); // error=> we can not call "dogName" variable with reference "Animal" class
        // obj2.bark(); error=>  we can not call "bark()" method with reference "Animal" class
        // reference type decides what can be called and accessed

        obj2.eat(); // always overridden method one will be executed
        obj2.methodA(); // static method can not be overridden

        Animal animal1 = new Cat("Ann","F",2);

       boolean isCat = animal1 instanceof Cat; // instanceof=> it is used in order to identify the object type

        System.out.println(isCat); // true=> cat is an animal

        Dog d1 = new Dog("Zack","M",5);

       // boolean r1 = d1 instanceof Cat;//error=>>  there is no IS A relation between dog and cat

        Animal animal2 = new Cat("Derly","F",1);

        boolean r2 = animal2 instanceof Animal;
        System.out.println(r2);  // true=> it means that animal is an animal









    }
}
