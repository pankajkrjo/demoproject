package com.java.java8Stream;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String paragraph="my name is pankaj";

        Map<Character,Integer>  freq=new LinkedHashMap<>();

         for(char c:paragraph.toCharArray()){
             if(c ==' ')continue;
                freq.put(c, freq.getOrDefault(c,0)+1);
         }
         for(Map.Entry<Character,Integer> entry:freq.entrySet()){
             if(entry.getValue()==1)
             {
                 System.out.println("First non-repeated character: " + entry.getKey());
                 return;
             }
         }

         System.out.println("No non-repeated character:");

    }

}
