package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObjects2 {

    public static void main(String[] args) {

        /*
        create 5 car objects
        put them in array of cars
        use for loop to get each car info
        use for each loop to get each car info
         */

        Car car1 = new Car();
        car1.setCarInfo("BMW","X7",2020,"White",5000);

        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Toyata","High Lander",2020,"Purple",0);

        car2.getCarInfo();

        Car car3 = new Car();

        car3.setCarInfo("Audi","Q7",2015,"Black",89676);
        car3.getCarInfo();

        System.out.println("=========================================================================");

        Car [] cars = {car1, car2, car3};  // we can not store here but car

        for (int i = 0; i < cars.length; i++){
            cars[i].getCarInfo();
        }

        System.out.println("==================================================================");

        for(Car eachCar: cars){

            eachCar.getCarInfo();

        }
        System.out.println("==============================================================================");
        // System.out.println(car1);  // gives us hashcode

        System.out.println(car1);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);  // toString method gets executed automatically












    }





}
