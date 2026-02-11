package com.java.streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String args[]){

        List<String> str= Arrays.asList("Pankaj","Rakhi","Komal","Arti","Aa","Aak");
        List<String>   filterName=str.stream()
                .filter(value->value.startsWith("A"))
                //.map(String::toUpperCase)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(filterName);

        List<Integer> obj=new ArrayList<>();
           obj.add(90);
           obj.add(900);

           List<Integer> filterint=obj.stream()
                                      .filter(value->value.equals(90))
                 //  .map(Integer::intValue)
                                              .collect(Collectors.toList());
           System.out.println(filterint);

           //Sum of Squares of Even Numbers
                int result=obj.stream()
                                 .filter(n->n%2==0)
                                 .map(n->n*n)

                                 .reduce(0,Integer::sum);
                System.out.println("result---  " +result);// Output: 818100 (90*90 + 900*900)




    }
}
