package com.java.java8Stream;

import java.util.Arrays;
import java.util.Collections;


public class SortDescending {

    public static void main(String[] args) {
        int [] arr={902,34,12,90,89,45};
         Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);

        }
    }
