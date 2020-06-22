package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>(); // First in first out
        q.add("Banana");
        q.add("Apple");
        q.add("Strawberry");
        q.add("Orange");

        System.out.println(q.poll());  // "apple" (alphabetical order)
        System.out.println(q);

    }

}
