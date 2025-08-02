package com.java.SingleDobuletonclass;

public class SingletonClass {

    private static SingletonClass instance;
    private String value;
    private SingletonClass(String value) {
        this.value = value;
    }
    public static SingletonClass getInstance(String value) {
        if (instance == null) {
            instance = new SingletonClass(value);
        }
        return instance;
    }
   public Object getValue() {
        return value;
    }

    public static  void main(String args[]){
        SingletonClass singleton1 = SingletonClass.getInstance("thrid  Instance");
        System.out.println(singleton1.getValue());

        SingletonClass singleton2 = SingletonClass.getInstance("Second Instance");
        System.out.println(singleton2.getValue());

        // Both instances should be the same
        System.out.println(singleton1 == singleton2); // Should print true
    }

}
