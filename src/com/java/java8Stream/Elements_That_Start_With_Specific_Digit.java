package com.java.java8Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Elements_That_Start_With_Specific_Digit {

    public static void main(String[] args) {
        int [] arr={3,2,11,23,56,45,113};
        Arrays.stream(arr)
                .boxed()
                .map(String::valueOf)
                .filter(n->n.startsWith("1"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
