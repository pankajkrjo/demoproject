package com.java.streamExample;

import java.util.Arrays;
import java.util.List;

public class Counts {
    public static  void main(String args[]){

        List<Integer> number= Arrays.asList(3,4,5,6,7,8,9,10);
        long count=number.stream()
                .count();
        System.out.println(count);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        long nameCount = names.stream().count();
        System.out.println(nameCount); // Output: 3

        List<String> name = Arrays.asList("Anna", "Alex", "Bob", "Amanda");

        long namecount=name.stream().filter(n->n.startsWith("A")).count();
        System.out.println(namecount);
 //count even number
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
          long evenNumber=numbers.stream().filter(n->n%2==0).count();
          System.out.println(evenNumber);
    }
}
