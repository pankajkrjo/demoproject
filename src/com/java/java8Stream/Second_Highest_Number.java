package com.java.java8Stream;

import java.util.Arrays;
import java.util.Comparator;

public class Second_Highest_Number {

    public static void main(String[] args) {

        int[] arr={32,34,45,76,89,56};
       int x= Arrays.stream(arr)
                .boxed()
               // .sorted(Comparator.naturalOrder())
               .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

       System.out.println(x);
    }
}
