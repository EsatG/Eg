package day37_Constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota","Corolla",2020,25000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1);

        Car car2 = new Car("Mercedes","G50",2020,45000);
        System.out.println(car2);
    }
}
