package com.java.number;

import java.util.Arrays;

public class ConvertIntToStringArray {
    public static void main(String args[]) {

        int i1 = 2;
        String s1 = Integer.toString(i1);
        System.out.println(s1);

        int[] arr1 = {1, 2, 4, 5};
        String [] setArray=new String[arr1.length];
        for (int a = 0; a < arr1.length; a++) {
            //String[] s2 = Integer.toString(a);
            setArray[a]=String.valueOf(arr1[a]);
        }
        System.out.println(Arrays.toString(setArray));

        //other way
        int[] intArray = {1, 2, 3, 4, 5};

        String[] strArray = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(strArray)); // Output: [1, 2, 3, 4, 5]
    }
}
