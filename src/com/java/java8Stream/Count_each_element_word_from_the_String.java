package com.java.java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Count_each_element_word_from_the_String {

    public static void main(String[] args) {

        List<String> arrList= Arrays.asList("php","php","java","net","html");
        Map<Integer,List<String>> map= arrList.stream()
                .collect(Collectors.groupingBy(String::length))
               ;
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry);
        }

    }
}
