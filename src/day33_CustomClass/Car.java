package day33_CustomClass;

public class Car {

    String Brand;
    String model;
    int year;
    String color;
    int mileage;

    public void start(){
        System.out.println(Brand + " is started");
    }

    public void drive(){
        System.out.println("Driving " + Brand + " " + model);
    }

    public void getCarInfo (){
        System.out.println(year + " " + Brand + " " + model + " " + color + " " + mileage + " miles");
    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor, int carMileage){

        Brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;

    }

    public String toString(){
        String result = year + " " + Brand + " " + model + " " + color + " " + mileage + " miles";

        return result;
    }

    public static void main(String[] args) {



        int a = 100;// "a" is a local variable which is declared within a block

    }
}
