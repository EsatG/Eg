package day49_Polymorphism;

interface Animal {

}

class Dog implements Animal {

}

class Cat implements Animal {

}

class Robot {

}

public class Polymorphism_Intro {

    /*
     - object's behave in different forms
     - occurs when parent class/interface reference to child class' objects
     - sub class can never be the reference type of super class objects

     */

    public static void main(String[] args) {

       // Animal obj = new Animal(); error=> interface can not have an object
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();

        Dog obj4 = new Dog();
        Cat obj5 = new Cat();

       //  Animal obj6 = new Robot();error=> because there is a no "is a" relation with Robot and Animal

        Animal [] animals = { obj2, obj3, obj4, obj5 };

    }

}
