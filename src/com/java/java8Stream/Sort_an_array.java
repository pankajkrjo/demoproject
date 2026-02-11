package com.java.java8Stream;

import java.util.Arrays;

public class Sort_an_array {

    public static void main(String[] args) {

        int arr[] ={3,5,7,192,1};
        Arrays.parallelSort(arr);

        Arrays.stream(arr).forEach(n->System.out.println(n));
    }
}
