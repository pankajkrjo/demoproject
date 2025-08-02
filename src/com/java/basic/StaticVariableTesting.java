package com.java.basic;

public class StaticVariableTesting {
    int x=10;
    static int y=20; // Static variable

    public static void main(String args[]){

        StaticVariableTesting obj1 = new StaticVariableTesting();
        obj1.x=10;
        obj1.y=20;
        System.out.println(obj1.x+"===="+ obj1.y);
        StaticVariableTesting obj2 = new StaticVariableTesting();
        obj2.x=30;
        obj2.y=40; // Changing static variable
        System.out.println(StaticVariableTesting.y);

        System.out.println(obj2.x+"----"+ obj2.y);  // Output: 30
        StaticVariableTesting obj3 = new StaticVariableTesting();

        System.out.println(obj3.x+"++++"+ obj3.y);  // Output: 20

    }
}
