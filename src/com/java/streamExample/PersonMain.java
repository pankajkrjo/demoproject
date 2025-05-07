package com.java.streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonMain {

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }


    public static void main(String args[]) {

        List<Person> per=new ArrayList<>();
        Person obj = new Person("pankaj", 1234, "2");
        Person obj1 = new Person("tamal", 123467, "3");
        Person obj2 = new Person("pankaj", 12348, "3");
        Person obj3 = new Person("tamal", 1234679, "5");
          per.add(obj);
          per.add(obj1);
          per.add(obj2);
          per.add(obj3);
        List<Person> str=per.stream()
                        .filter(distinctByKey(Person::getRoolnumber))
                        .collect(Collectors.toList());
      //    str.forEach(System.out::println);
       // System.out.println(str);

      for(Person value:str){
         int numer= Integer.parseInt(value.getRoolnumber());
         if(numer>3)
             System.out.println(value);
      }


    }
}