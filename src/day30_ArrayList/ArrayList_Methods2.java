package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
                list.add("A");
                list.add("B");
                list.add("C");

        // list.remove(1);
        String str = "F";
          boolean r1 = list.remove(str);  // false
          boolean r2= list.remove("A");   // true

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("====================================================");

        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("==================================================================");

        ArrayList<Integer> list2 = new ArrayList<>();
                  list2.add(10);
                  list2.add(10);
                  list2.add(20);
                  list2.add(30);
          int num = list2.indexOf(20);   // Integer = int   Autoboxing
        System.out.println(num);





    }
}
