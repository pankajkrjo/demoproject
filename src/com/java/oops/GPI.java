package com.java.oops;

 interface GPI {

    default void show()
    {
        System.out.println("Defult GPI");
    }
}
 interface Px1 extends GPI{

}
interface  Px2 extends GPI{
}

class Test implements Px1, Px2{

     public static  void main(String args[]){
         Test obj=new Test();
         obj.show();
     }
}
