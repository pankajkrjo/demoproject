package com.java.collection.ArrayList;

import java.util.ArrayList;

public class PersonisEmpty {

    String s;
    int i;

    public PersonisEmpty(String s, int i) {
        this.s = s;
        this.i = i;
    }

    public static void main(String args[]){
        ArrayList<PersonisEmpty> p=new ArrayList<>();

        //check ArrayList is empty
        System.out.println(p.isEmpty());
        p.add(new PersonisEmpty("java",3));
        System.out.println(p.isEmpty());


    }
}
