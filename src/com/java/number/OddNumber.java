package com.java.number;

import java.util.Arrays;

public class OddNumber {


    public static void main(String[] args) {


        //Using Parallel Stream
        System.out.println("Using Parallel Stream");

        int[] arrs = {6, 7, 8, 9, 10};
        int sum = Arrays.stream(arrs)
                .parallel()
                .filter(n -> n % 2 != 0)
                .reduce(0, (a, b) -> a + b);
        //  .sum();
        System.out.println("Sum of even numbers using parallel stream: " + sum);
    }
}
