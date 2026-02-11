package com.java.java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String args[]){

        List<Integer> num= Arrays.asList(3,5,2,9,10,36,4);
            num.stream()
                    .filter(n->n%2==0)
                    .collect(Collectors.toList()).forEach(System.out::println);
            int[] arr={1,5,2,9,10,9,4};
            System.out.println("Array object");
            Arrays.stream(arr).boxed().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
