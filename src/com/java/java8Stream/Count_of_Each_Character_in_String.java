package com.java.java8Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_of_Each_Character_in_String {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("pankaj","java","java","php");


       /* Map<Integer,List<String>> obj=list.stream()
                .collect(Collectors.groupingBy(String::length));

          for(Map.Entry entry:obj.entrySet())
          {
              System.out.println(entry);
          }
*/
        Map<String, Long> maplist=list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(str->str, LinkedHashMap::new, Collectors.counting()));
        System.out.println(maplist);

// or you can also try using Function.identify() instead of LinkedHashMap


        Map<String, Long> mapObject=list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.print(mapObject);
    }
}
