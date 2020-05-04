package MyStudies;

import java.util.ArrayList;

public class ada {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("food bar");
        arrayList.add("drink");
        arrayList.add("bread box");
        arrayList.add("drink");
        arrayList.add("food bar");
        arrayList.add("drink");

        boolean found = arrayList.contains("drink");
        System.out.println(found);

        int ind = arrayList.indexOf("drink");
        System.out.println(ind);

        int index = arrayList.lastIndexOf("food bar");
        System.out.println(index);













    }
}
