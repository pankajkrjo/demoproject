package com.java.number;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DuplicateElements {


    public static  void main(String args[]){
        int [] arr={2,4,2,6,7,4,6};
        int[] arr2=new int[2];
        int[] arr3=new int[arr.length];
        int count=0;
        for(int i=0;i <arr.length-1;i++){
              for(int j=0;j<i;j++){
                  if(arr[i]==arr[j]){
                     arr2[j]=arr[i];
                    count++;
                  }
              }
        }
        for(int d:arr2)
        System.out.println(" "+d);
        System.out.println("Number DuplicateElements "+count);
        for(int d2:arr3)
            System.out.println(" "+d2);

        /*List<int[]> st= Arrays.asList(arr);
        for (int[] ints : st) {
            for(int so ;ints<0, ints++)
            System.out.println(ints[so]);
        }*/
    }
}



