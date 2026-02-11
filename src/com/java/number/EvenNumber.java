package com.java.number;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String arg[]) {
        List<Integer> list = Arrays.asList(10, 12, 15, 14, 80);
        list.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        int[] arr = {10, 12, 15, 14, 80};

        //other way sort arrays
        Map<Boolean, List<Integer>> lists = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(list);
    }
}