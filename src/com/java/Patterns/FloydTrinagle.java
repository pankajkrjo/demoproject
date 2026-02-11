package com.java.Patterns;

public class FloydTrinagle {
    public static void main(String args[]){

        int n=9;
        for(int i=0; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+i-1+" ");
            }
            System.out.print("\n");
        }

        System.out.print("-----oioo");
        int num=1;
        for(int i=1;i<n;i++){
            for(int j=2;j<i;j++){

                System.out.print(num +" ");
           num++;
            }
            System.out.print("\n");
        }

        int v=1;
          for(int i=0; i<=n;i++)
          {
              for(int j=i+1; j>0; j--){
                  System.out.print(v+" ");
                  v++;
              }
              System.out.println("\n");
          }
    }
}
