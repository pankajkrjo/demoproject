package com.java.Patterns;

public class InvertedTriangle {

    public static void main(String args[]){
        int n=5;

        for(int i=0; i<n;i++){
            //spaces
            for(int j=0;j<=i; j++){
                System.out.print(" ");
            }
            //NUM
            for(int k=1;k<=n-i;k++){
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
        for(int i=0; i<n;i++){
            for(int j=0;j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(i);
            }
            System.out.print("\n");
        }

        for(int i=0; i<n;i++){
            for(int j=0;j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(k);
            }
            System.out.print("\n");
        }

        for(int i=0; i<n;i++){
            //spaces
            for(int j=0;j<=i; j++){
                System.out.print(" ");
            }
            //NUM
            for(int k=1;k<=n-i;k++){
                System.out.print(i+1+" ");
            }
            System.out.print("\n");
        }
    }
}
