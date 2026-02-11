package com.java.collection.ArrayList;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GetObjectJava8 {

    public static void main(String args[]) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(90);
        obj.add(10);
        obj.add(12);
        obj.add(905);
        obj.add(101);
        System.out.println("print object: " +obj);
        obj.forEach(value->{
            System.out.print("Print values :" +value);
        });

        obj.forEach(num->{
            System.out.println("Mutiplication " +num*num);
        });

        obj.forEach(System.out::println);

        System.out.println("Sorting List");
        obj.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        ArrayList<String> s = new ArrayList<>();
        s.add("Cherry");
        s.add("Blueberry");
        s.add("Strawberry");

        // Use forEach() to print each fruit
        s.forEach(System.out::println);
    }
}