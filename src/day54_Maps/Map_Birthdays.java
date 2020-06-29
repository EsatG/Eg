package day54_Maps;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Birthdays {
    public static void main(String[] args) {

        Map<String, LocalDate> students = new LinkedHashMap<>();
        students.put("Esat",LocalDate.of(1981,10,2));
        students.put("Yucel",LocalDate.of(1968,5,28));
        students.put("Andi",LocalDate.of(1987,9,21));
        students.put("Ahmet",LocalDate.of(1991,7,15));
        students.put("Fatih",LocalDate.of(1983,8,19));

        students.put("Yucel",LocalDate.of(1967,7,30));
        students.put("Baby",LocalDate.now());

        students.remove("Ahmet");

        System.out.println(students);
        System.out.println("Size of the Map: " + students.size());

        System.out.println(students.get("Yucel"));

        System.out.println(students.containsKey("Ahmet"));  // false
        System.out.println(students.containsKey("Esat"));  // true
        System.out.println(students.containsValue(LocalDate.of(1990,5,23)));  // false
        System.out.println(students.containsValue(LocalDate.of(1981,10,2)));  // true

        students.clear();
        System.out.println(students);

    }
}
