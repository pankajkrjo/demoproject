package com.java.Threads;

public class NewThread extends Thread{

    public  void run(){
        System.out.println("Run Java Application");
    }

    public static  void main(String args[]){
        NewThread obj=new NewThread();
        obj.start();
    }
}
