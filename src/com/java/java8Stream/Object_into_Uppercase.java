package com.java.java8Stream;

import java.util.Arrays;
import java.util.List;

public class Object_into_Uppercase {

    public static void main(String[] args) {
        List<String> strlist= Arrays.asList("pankaj","tamal");
            strlist.stream().map(String::toUpperCase)
                    .forEach(System.out::println);
    }
}
