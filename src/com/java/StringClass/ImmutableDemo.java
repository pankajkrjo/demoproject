package com.java.StringClass;



 final class   Person {
     final String name;
     final int number;

    Person(String name, int number) {
        this.name = name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
 class ImmutableDemo {
    public static void main(String args[]){

        Person obj1=new Person("pankaj", 8999);
        Person obj2=new Person("pankaj", 8999);

        System.out.println(obj1.getName()+" "+ obj1.getNumber());
        System.out.println(obj2.getName() +" " +obj2.getNumber());
     System.out.print(obj1==obj2);
    }
}
