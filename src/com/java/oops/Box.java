package com.java.oops;

//T is a type parameter.
//You can use Box<Integer>, Box<String>, etc.
//At runtime, T is replaced by the actual type passed during object creation
 class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class D {

     public static void main(String[] args){

         Box<String> arg=new Box<>();
         arg.setValue("Java");
         System.out.println(arg.getValue());

         Box<Integer> arg1=new Box<>();
         arg1.setValue(9);
         System.out.println(arg1.getValue());

     }
 }