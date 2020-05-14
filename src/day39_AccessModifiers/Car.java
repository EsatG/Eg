package day39_AccessModifiers;

public class Car {
    /*
    instance variable:
    brand, model, year, price
    add a constructor that can initialize brand of car
    add a constructor that can initialize brand and model of the car
            (apply constructor call to initalize the brand)
    add a constructor that can initialize the brand, model, year of the car
            (apply constructor call to initialize brand, model)
    add a constructor that can initialize brand, model, year and price of the car
            (apply constructor call to initialize brand, model, year)
    add toString method

   */

    String brand;
    String model;
    int year;
    double price;

    public Car (String brand){
        this.brand = brand;
    }

    public Car(String brand, String model){

        this(brand);
        this.model = model;
    }

    public Car(String brand,String model, int year){

        this(brand,model);
        this.year = year;

    }

    public Car(String brand,String model, int year,double price){

        this(brand, model, year);
        this.price = price;

    }

    public String toString(){

        return year +" " + brand + " " +  model + " $" + price;
    }


}

class CarObjects{

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        System.out.println(car1);

        Car car2 = new Car("BMW","X8");

        System.out.println(car2);

        Car car3 = new Car("Mercedes","G50",2020);

        System.out.println(car3);

        Car car4 = new Car("Lexus","RX",2020,28000);

        System.out.println(car4);
    }
}
