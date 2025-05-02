package com.java.number;

import java.util.ArrayList;

public class CustomWrapperClasses {

// Java Program to implement
// Custom wrapper class

        private int maxi = 0;
        private int size = 0;
        int arr[] =new int[6];
      ArrayList<Integer> obj=new ArrayList<Integer>();
        public void insert(int x)
        {
            this.size++;
            if (x <= this.maxi)
                return;
            this.maxi = x;

            obj.add(x);
        }
        public int show() {
            obj.forEach(value -> {
                System.out.println("Addeed valuse" + value);
            });


            return 0;
        }

        public int top() { return this.maxi; }

        public int elementNumber() { return this.size; }
    };

    class Geeks {
        public static void main(String[] args)
        {
            CustomWrapperClasses x = new CustomWrapperClasses();
            x.insert(1);
            x.insert(3);
            x.insert(23);

            System.out.println("Maximum element: " + x.top());
            System.out.println("Number of elements inserted: "
                    + x.elementNumber());
            System.out.println("inserted elements" +x.show());
        }
    }