package com.java.basic;

public class oops {

    public void print(Object o) {
        System.out.println("Object version: " + o);
    }

    public void print(String s) {
        System.out.println("String version: " + s);
    }

    public void print(Integer i) {
        System.out.println("Integer version: " + i);
    }
    public static void main(String args[]){

       /* int x=0;
        if(x){
            System.out.println("x is true");
        } else {
            System.out.println("x is false");
        }
        while (1) {


        }*/

        oops obj = new oops();
          obj.print("Hello, World!");



    }
}
