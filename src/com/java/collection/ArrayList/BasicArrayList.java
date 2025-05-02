package com.java.collection.ArrayList;


import java.util.Arrays;
import java.util.*;

public class BasicArrayList {

    public static void main(String args[]){
        List<Integer> arr= Arrays.asList(8,9,90);
        for(int i:arr){
            System.out.println(i);
        }
        arr.forEach(print->{
            System.out.println(print);
        });

        ArrayList<Integer> arry = new ArrayList<Integer>(6);

        // Adding elements to the ArrayList
        arry.add(1);
        arry.add(2);
        arry.add(4);
        arry.add(50);
        arry.add(5);
        arry.add(2);

        // Using indexOf() to find the
        // first index of 4
        int p1 = arry.indexOf(50);
        System.out.println("index 4 - " +p1);

        // Using lastIndexOf() to find the
        // last index of 4
        int p2 = arry.lastIndexOf(4);

        // Balancing the 0-based indexing
        p1 = p1 + 1;
        p2 = p2 + 1;

        // Printing first and last index of 4
        System.out.println("The first occurrence of 4 is: " + p1);
        System.out.println("The last occurrence of 4 is: " + p2);

        // Creating an ArrayList of Integers
        ArrayList<Integer> arri = new ArrayList<Integer>(5);

        // Adding elements to the ArrayList
        arri.add(10);
        arri.add(20);
        arri.add(30);

        // Trying to find the index of
        // a non-existent element
        int p = arri.indexOf(50);

        System.out.println("The index of 50 is: " + p);


        ///isEmpty

        ArrayList<Integer> n = new ArrayList<>();

        // Checking if the ArrayList is empty
        boolean res = n.isEmpty();

        System.out.println("" + res);

        // Adding an element
        // to the ArrayList
        n.add(21);

        // Checking again if the
        // ArrayList is empty
        res = n.isEmpty();
        System.out.println("" + res);



    }
}


