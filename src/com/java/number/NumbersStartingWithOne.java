package com.java.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {

    public static void main(String args[]){
        List<Integer> list= Arrays.asList(10,42,17,8,9);
        List<String> str=Arrays.asList("pankaj","php","net");
        List<String> strs=new ArrayList<>();
        for(String sti:str){
            if(sti.startsWith("p")){
                strs.add(sti);
            }
        }
        System.out.println("String Start with"+ strs);

        str.stream().filter(s->s.startsWith("p")).collect(Collectors.toList()).
                forEach(System.out::println);

        List<Integer> result=new ArrayList<>();
       // for(int i=0; i<list.size();i++){
        for(Integer arr:list){
            if(String.valueOf(arr).startsWith("1"))
            {
                result.add(arr);
            }
        }
        System.out.println(result);
        List<Integer> numbers = Arrays.asList(10, 23, 12, 45, 19, 100, 99, 154, 1);

        List<Integer> results = numbers.stream()
                .map(String::valueOf) // Convert each number to String
                .filter(s -> s.startsWith("1")) // Filter numbers starting with '1'
                .map(Integer::valueOf) // Convert back to Integer
                .collect(Collectors.toList());

        System.out.println(results);


        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(s -> s + "") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);

        /* or can also try below method */

        int[] arr = {10,15,8,49,25,98,32};
        List<String> listd = Arrays.stream(arr).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(listd);
        myList.stream()
                .map(n->n +"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
    }
