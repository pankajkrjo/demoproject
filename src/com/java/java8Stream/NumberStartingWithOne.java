package com.java.java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,5,7,18,19,20,100);
          list.stream()
                  .map(s->s +"")
                  .filter(s->s.startsWith("1"))
                  .forEach(System.out::println);

    }

}
