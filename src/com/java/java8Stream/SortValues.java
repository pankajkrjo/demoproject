package com.java.java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(29,20,13,42,15);
        int [] arr={29,20,13,42,15};
        for (Integer integer : list.stream().sorted().collect(Collectors.toList())) {

            System.out.println(integer);
        }
  System.out.println("=======");
        for(Integer integer: Arrays.stream(arr).boxed().sorted().collect(Collectors.toList())){
            System.out.println(integer);
        }
    }
}
