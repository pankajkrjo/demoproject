package com.java.java8Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {


    public static void main(String[] args) {

        String input = "Java Streams make life easier";

        // o/p==Streams
        String[] arr=input.split(" ");
        List<String> list= Arrays.asList(arr);

        String longestString = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(longestString);

        int maxLength = list.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        System.out.println("Max length = " + maxLength);

    }
}
