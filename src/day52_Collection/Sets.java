package day52_Collection;



import java.util.*;

public class Sets {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Esat");
        names.add("Omer");
        names.add("Cevdet");
        names.add("Dilber");
        names.add("Esat");  // it will not print out duplicated one

        System.out.println(names);

        Set<String> names2 = new LinkedHashSet<>();
        names2.add("Esat");
        names2.add("Omer");
        names2.add("Cevdet");
        names2.add("Dilber");
        names2.add("Esat");  // it will not print out duplicated one

        System.out.println(names2);

        String [] arr = {"A","A","C","B","A"};  // ACB

        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println("===============================================================");

        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(5,2,0,8,-2,11,6,2,11));   // remove the duplicates and sort the numbers

        System.out.println(numbers);

        System.out.println("===================================================================");

        TreeSet<String> treeSet = new TreeSet<>();
        // treeSet.addAll(Arrays.asList(null));
        // System.out.println(treeSet);  // NullPointerException

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet);   // HashSet accepts "null" but ThreeSet does not accept it

    }
}
