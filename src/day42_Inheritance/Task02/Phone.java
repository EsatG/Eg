package day42_Inheritance.Task02;
/*
attributes: brand, model, price, country
				methods: call, text,  toString
 */
public class Phone extends Device {

    public Phone(String brand, String model,double price,String size,String country){
        setDevice(brand,model,price,"Phone",size,country);

    }

    public void call (long number){
        System.out.println("I am calling the number: " + number);
    }
    public void text (long number){
        System.out.println("I am texting the number: " + number);
    }

}
