package com.java.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {

    //The distinct() method is an intermediate stream operation
    // that returns a stream with duplicate elements removed, based on equals().
    //stream.distinct()
    public static void main(String args[]){

        List<String> name= Arrays.asList("java","php","angular","php");
        List<String> distict=name.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(distict);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5]
    }


}
