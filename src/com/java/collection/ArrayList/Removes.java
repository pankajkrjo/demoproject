package com.java.collection.ArrayList;

import java.util.ArrayList;

public class Removes {

    public static void main(String args[]){
        ArrayList<String> str=new ArrayList<>();
        str.add("pankaj");
        str.add("rakhi");
        str.add("hello");
        str.remove(2);
        System.out.print(str);

        str.removeAll(str);

        System.out.print("deleted"+str);
    }
}
