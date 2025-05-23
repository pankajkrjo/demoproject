package com.java.streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAlls {

   /* The Java ArrayList removeIf() method is used to remove all elements from the ArrayList that satisfy a given predicate filter. The predicate is passed as a parameter to the method, and any runtime exceptions thrown during iteration or by the predicate are passed to the caller.
     The removeIf() method uses Java 8’s Predicate functional interface to apply conditions for removing elements.

     1. boolean removeIf(Predicate filter)
     2.Parameter: This method takes a parameter “filter” that specifies the condition for removing elements.
       Return Type: This method returns true if any elements were removed; otherwise, false.
       Exception: This method throws NullPointerException if the specified filter is null.
   */
       public static void main(String args[]) {

           // create an ArrayList of integers
           List<Integer> num = new ArrayList<>();

           // Adding numbers to
           // the ArrayList
           num.add(23);
           num.add(32);
           num.add(45);
           num.add(63);

           // Using removeIf() method to remove
           // numbers divisible by 3
           num.removeIf(n -> (n % 3 == 0));
           System.out.println(num);

           ArrayList<String> s=new ArrayList<>();
                   s.add("Swati");
                   s.add("Gudly");
                   s.add("Sohan");
                   s.add("Amiya");
                   s.add("Ram");

                   s.removeIf(name->name.startsWith("S"));

           System.out.println("Students whose names do not start with S:");
           System.out.println(s);
    }
}
