package com.java.exceptions;

public class ThrowEx {

    static ArithmeticException ex=new ArithmeticException();
    static ArithmeticException e;
    public static void main(String args[]){

     throw  ex; //ArithmeticException Run time
        //throw e;  Nullpointer Excption Run time

    }
}
