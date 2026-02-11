package com.java.java8Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Finding_the_First_Unique_Character {

    public static void main(String[] args) {

        String ps="paragraph";

        Character ch=   ps.chars()
                   .mapToObj(c->(char)c)
                   .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                   .entrySet()
                   .stream()
                   .filter(entry->entry.getValue()==1)
                   .map(Map.Entry::getKey)
                   .findFirst()
                   .orElse(null);

        System.out.println(ch);


    }
}
