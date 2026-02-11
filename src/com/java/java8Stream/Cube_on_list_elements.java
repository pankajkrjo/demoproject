package com.java.java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cube_on_list_elements {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(3,5,2,6,4,8,9);
                       list.stream()
                               .map(n->n*n)
                               .filter(n->n>50)
                               .collect(Collectors.toList())
                               .forEach(System.out::println);
    }
}
