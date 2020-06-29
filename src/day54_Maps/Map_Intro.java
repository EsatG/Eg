package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {

        Map<String,Double> employeeInfo = new LinkedHashMap<>(); // String: Key, Double: value
        employeeInfo.put( "Esat",140000.0 );
        employeeInfo.put("Cevdet",200000.0);  // put(key,value)

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size()); // 2

        System.out.println(employeeInfo.get("Esat"));  // get method accept "key" as a parameter in Map
        System.out.println(employeeInfo.get("Cevdet"));

        employeeInfo.remove("Esat");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size()); // 1

        employeeInfo.put("Cevdet",150000.0);  // does not accept same "key" as Cevdet, last key's value will be valid, first one will be unvalid

        System.out.println(employeeInfo);


    }
}
