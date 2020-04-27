package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");  // size 1
        shoppingList.add("Egg");   // size 2
        shoppingList.add("Water"); // size 3
        shoppingList.add("Lemon"); // size 4
        shoppingList.add("Bread"); // size 5
        System.out.println(shoppingList);

        for (int i = 0; i < shoppingList.size(); i++){
            System.out.println(shoppingList.get(i));
        }

        System.out.println("==================================================================");

        for (String each: shoppingList){
            System.out.println(each);
        }

        // size ():
        int size = shoppingList.size();
        System.out.println(size);

        int lastIndex = shoppingList.size() - 1;
        System.out.println(lastIndex);

        /*
        System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));

         */

    }
}
