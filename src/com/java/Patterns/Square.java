package com.java.Patterns;

public class Square {
    public static  void main(String args[]){

        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(""+j);
            }
            System.out.print("\n");
        }

        for(int i=0;i<5;i++){
            char st='A';
            for(int j=0;j<5;j++){
                System.out.print(st);
                st++;
            }
            System.out.print("\n");
        }

       int value=1;
        for(int i=0;i<5;i++){
         for(int j=0;j<5;j++){
            System.out.print(value+" ");
             value++;
            }
         System.out.print("\n");
        }
        char ch='A';
        for(int i=0;i<5;i++){
            for(int j=0;j<26;j++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.print('\n');
        }
    }
}
