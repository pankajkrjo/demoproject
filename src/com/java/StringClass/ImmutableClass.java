package com.java.StringClass;

public class ImmutableClass {
    public static  void main(String args[]){

        String s=new String("Durga");
        s.concat("Software");
        System.out.println(s);

        //MutableClass
        StringBuffer st=new StringBuffer("Durga");
        st.append("Software");
        System.out.println(st);
    }
}
