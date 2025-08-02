package com.java.Threads;

public class MultithreadingviaRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(" Runnable interface");
    }

    public  static void main(String args[]){
        MultithreadingviaRunnable obj=new MultithreadingviaRunnable();
          Thread obj2=new Thread(obj);
            obj2.start();




    }
}
