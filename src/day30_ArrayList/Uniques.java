package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    /*
    write a program that can find the unique elements from an ArrayList of integers and
    stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // { 1,2,1}
                list.add(1);
                list.add(2);
                list.add(1);
                list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();



          for (int i = 0; i < list.size(); i++){     //  for (Integer each2 : list)  Also we can use for each loop

              int count = 0;
              for (Integer each: list){
                  if(each == list.get(i)){
                      count++;
                  }
              }
              if (count == 1){
                  uniques.add(list.get(i));
              }

          }
        System.out.println(uniques);















    }
}
