package OfficeHours.Practice_05_13_2020;

public class InstanceTest {

    public static void main(String[] args) {

        Instances obj1 = new Instances();
        obj1.name = "Esat";

        Instances obj2 = new Instances();
        obj2.name = "Cevdet";

        System.out.println(obj1.name);
        System.out.println(obj2.name);

        obj1.printName();
        obj2.printName();


    }

}

class InstanceBlock {

    public static void main(String[] args) {

        Instances obj = new Instances();
        System.out.println(obj.name);
    }


}
