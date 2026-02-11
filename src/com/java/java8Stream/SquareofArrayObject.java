package com.java.java8Stream;

import java.util.Arrays;

public class SquareofArrayObject {

    public static void main(String[] args) {

        int [] arr={11,12,13,14,15};
      int [] arrys=  Arrays.stream(arr)
                .map(n->n*n)
                .toArray();

      System.out.println(Arrays.toString(arrys));


    }
}
