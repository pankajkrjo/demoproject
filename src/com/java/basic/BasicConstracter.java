package com.java.basic;

public class BasicConstracter {
    // Constructor
    static int x=0;
     BasicConstracter() {
        x++;
        System.out.println("Constructor called");
        System.out.println("Value of x: " + x);
    }
    // Method to demonstrate the constructor
     BasicConstracter(int b){
        x++;
        System.out.println("Parameterized Constructor called");
        System.out.println("Value of x: " + x);
    }

    public static void main(String args[]){

         BasicConstracter obj1 = new BasicConstracter();
            BasicConstracter obj2 = new BasicConstracter(10);
    }
}
