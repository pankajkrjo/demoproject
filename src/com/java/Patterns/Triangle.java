package com.java.Patterns;

public class Triangle {

    public static void main(String args[]){

        for(int i=0; i<6;i++){
            for(int j=0;j<i+1;j++){

            System.out.print("*" +" ");
            }
            System.out.print("\n");
        }


        for(int i=1; i<6;i++){
            for(int j=1;j<i;j++){

                   System.out.print(j + " ");

            }
            System.out.print("\n");
        }
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0; j<i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }

        char ch='A';
        for(int i=0;i<27;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
        }

        for(int i=0; i<5;i++){
            for(int j=1; j<i+1;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }


    }
}
