package com.java.Patterns;

public class PyramidPattern {

    public static void main(String args[]){

        int n=8;
        //outer
        for(int i=0;i<n;i++){
            //Spaces
            for(int j=1;j<n-i-1;j++) {
                System.out.print(" ");
                //num1 i+1
            }
                for(int k=1;k<=i+1;k++){
                    System.out.print(k);
            }
                //num2
            for(int m=i;m>0;m--){
                System.out.print(m);
            }
            System.out.print("\n");
        }
    }
}
