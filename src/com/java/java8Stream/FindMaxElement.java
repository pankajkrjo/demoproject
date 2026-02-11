package com.java.java8Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(23,1,4,3,78,4,5);
       int mx= list.stream().max(Integer::compare)
                .get();
        System.out.println("Max----" +mx);

        int [] arr={2,45,21,67,34,100};
       int maximumn=    Arrays.stream(arr).boxed()
                   .max(Comparator.naturalOrder()).get();

        int x=  Arrays.stream(arr).max().getAsInt();
                  System.out.println("x--"+x);


    }
}
