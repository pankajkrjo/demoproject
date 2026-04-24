package com.java.java8Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> set=new HashSet<>();
        myList.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);

        System.out.println("distinct");
        myList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        /* Way 2 -  Gives list of all distinct/unique values */

        Set<Integer> setList=new HashSet<>(myList);
        // Convert the set back to a list if needed

        List<Integer> uniqueDate=set.stream().collect(Collectors.toList());
        uniqueDate.forEach(System.out::println);

        System.out.print(" Character Object");
        List<Character> charArrays=Arrays.asList('c','b','d','e','b');
          charArrays.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

    }
}
