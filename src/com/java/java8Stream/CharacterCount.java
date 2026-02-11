package com.java.java8Stream;

import com.sun.tools.javac.Main;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

    public static void main(String[] args) {
        String st="pankaj";

        Map<Character,Long> str=st.chars()//Convert string to a stream of char values (int)
                .mapToObj(c-> (char)c) //// Convert int values back to chars
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

                System.out.println(str);



                Character findFistReapatedChar=st.chars()
                        .mapToObj(c->(char)c)
                        .filter(c->str.get(c)==1)
                        .findFirst()
                        .orElse(null);
                System.out.println(findFistReapatedChar);
    }
}
