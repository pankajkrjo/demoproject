package com.java.java8Stream;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,5,4,3,1,8,56);
       Long num= list.stream()
                .count();

       System.out.println(num);
    }
}
