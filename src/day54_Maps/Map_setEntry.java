package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_setEntry {

    public static void main(String[] args) {

        LinkedHashMap<String,String> countries = new LinkedHashMap<>();
        countries.put("Turkey", "Ankara");
        countries.put("Tajikistan", "Dushanbe");
        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("East Turkistan","Urumqi");
        countries.put("USA", "Washington DC");

        String input = "turkey";
      for  ( Map.Entry<String,String> each : countries.entrySet() ) {

        //  System.out.println(each.getKey() +"'s capital is  " + each.getValue());

          String countryName = each.getKey();
          String cityName = each.getValue();

          if (input.equalsIgnoreCase(countryName)){
              System.out.println(cityName);
          }

      }

    }
}
