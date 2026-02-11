package com.java.java8Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First_Non_Repeated_Word_in_Paragraph {
    public static void main(String[] args) {
        String paragraph="my name is pankaj My name tamal tamal pankaj";

        String[] words=paragraph.toLowerCase().split("\\s+");
        Map<String,Integer> maplist=new LinkedHashMap<>();
        for(String s:words){
            maplist.put(s, maplist.getOrDefault(s,0)+1);
        }

        System.out.println(maplist);
       for(Map.Entry<String,Integer> entry:maplist.entrySet()){
           if(entry.getValue()==1){
               System.out.println(entry.getKey());

           }
       }

       System.out.println("=================");

        String paragraphs = "I love Java and I love Spring Boot";

// Split paragraph into words (ignore extra spaces and punctuation)
        String[] wordss = paragraphs.toLowerCase()
                .replaceAll("[^a-zA-Z0-9 ]", "") // remove punctuation
                .split("\\s+");

// Count occurrences using Java 8
        Map<String, Long> wordCount = Arrays.stream(wordss)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

// Find the first non-repeated word
        String firstNonRepeated = Arrays.stream(wordss)
                .filter(w -> wordCount.get(w) == 1)
                .findFirst()
                .orElse(null);

        System.out.println("First Non-Repeated Word: " + firstNonRepeated);


    }
}
