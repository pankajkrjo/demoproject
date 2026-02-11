package com.java.java8Stream;

import java.util.Arrays;

public class Longest_String_in_an_Array {

    public static void main(String[] args) {

        String s="patna is captail of bihar";
       String [] ch=s.split(" ");
      String st3=  Arrays.stream(ch)
                .reduce((str1,str2)->str1.length()>str2.length()?str1:str2)
                .orElse(null);

      System.out.println(st3);


    }
}
