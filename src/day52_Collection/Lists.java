package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        // List<String> list0 = new List<>();  error => object can not be created from "List" since it is interface

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("===================================================================");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        Vector<Integer> vector = new Vector<>();
        vector.add(10);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("==================================================================================");

        Stack<String> names = new Stack<>();
        names.add("Esat");
        names.add("Omer");
        names.add("Cevdet");
        names.add("Dilber");
        names.add("Gorgun");

        System.out.println(names);

        String s1 = names.pop();  // it will return and remove last added object which is "Gorgun"
        System.out.println(s1);

        System.out.println(names);

        names.pop(); // "Dilber"

        System.out.println(names);

    }

    public synchronized void method1(){

    }
}
