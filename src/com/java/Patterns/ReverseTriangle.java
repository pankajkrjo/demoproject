package com.java.Patterns;

public class ReverseTriangle {

    public static void main(String args[]){

        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(i-j);
            }

            System.out.print("\n");
        }

        int n=5;
        for(int i=0; i<n;i++){
            for(int j=i+1;j>0;j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }

    }
}
