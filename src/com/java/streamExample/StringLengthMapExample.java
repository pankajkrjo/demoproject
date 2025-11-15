package com.java.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLengthMapExample {

    public static void main(String[] args) {
        List<String> obj= Arrays.asList("pankaj","java","php");
        Map<Integer,List<String>> map=obj.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map);


    }
}
