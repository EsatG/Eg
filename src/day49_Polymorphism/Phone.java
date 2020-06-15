package day49_Polymorphism;

interface downloadable{

    boolean downloadable = true;  // by default it is public static final
    void download();

}

interface AndroidApps extends downloadable {  // 2 variables and 1 abstract method

    String AppStoreName = "Android";
}

interface AppleApps extends downloadable {    // 2 variables and 1 abstract method

    String AppStoreName = "Apple";
}

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;



   public abstract void texting(long phoneNumber);

   public abstract void calling(long phoneNumber);

   public String toString(){
       return "Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Size: " + size;
   }


}
