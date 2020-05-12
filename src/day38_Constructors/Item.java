package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    /*
    create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
     */

    String name;
    double unitPrice;
    int quantity;

    public Item(String name,double unitPrice,int quantity){
        this.name = name;
        this.unitPrice = unitPrice;       // this: refers to object instance; we can call instances of the object
        this.quantity = quantity;
    }

    public double calcCost(){

        return unitPrice * quantity;

    }
    public String toString(){
        return "Name: " + name + ", Unit Price: " + unitPrice + ", Quantity: " + quantity + ", Total Cost: $" + calcCost();
    }




}

class ShoppingList{
    public static void main(String[] args) {

        Item item1 = new Item("Banana",0.5,8);
        Item item2 = new Item("Apple",0.8,10);
        Item item3 = new Item("Orange",0.6,12);
        Item item4 = new Item("Egg",0.1,30);
        Item item5 = new Item("Bread",3,3);

        ArrayList<Item> list = new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalCost = 0;
/*
       //  solution 1
        for (Item each: list){
           totalCost += each.calcCost();
        }
        System.out.println("Total: " + totalCost);

 */
        for (int i = 0; i < list.size(); i++){
            totalCost += list.get(i).calcCost();
        }
        System.out.println("Total: $" + totalCost);



    }
}
