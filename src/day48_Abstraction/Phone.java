package day48_Abstraction;

public abstract class Phone {

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phoneNumber);
    public abstract void texting(long phoneNumber);

    public String toString(){
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Size: " + size;
    }

}
