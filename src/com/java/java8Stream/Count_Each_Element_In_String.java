package com.java.java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_Each_Element_In_String {

    public static void main(String[] args) {
        String str="my name is is pankaj";

        List<String> st= Arrays.asList(str.split(" "));
        Map<String, Long> stringCount=st.stream().collect(
                                        Collectors.groupingBy(
                                         Function.identity(),
                                         Collectors.counting()
        )
        );
          System.out.println(stringCount);


          String name="pankaj";
          List<String> chr=Arrays.asList(name.split(""));
         // System.out.print(chr);
          Map<String,Long> countChar=chr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
          System.out.print(countChar);
    }
}
