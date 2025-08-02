package com.java.Threads;

 class Thread1 {
     public  static void main(String args[]) throws InterruptedException {
       Thread2 obj=new Thread2();
       obj.start();
         System.out.println("kk");
         System.out.println("kk1");
         Thread.sleep(100);
         System.out.println("oo");
         synchronized (obj){
             System.out.println("Main Thread trying to wating");
             obj.wait(200);
             System.out.println("Main Thread get notification");
             System.out.println(obj.total);
         }


     }

}

class Thread2 extends Thread{

     int total=0;
     public void run(){

         {
             synchronized (this){
                 System.out.println("Child Thread start");
                 for(int i=0; i<10;i++){
                     total=total+i;
                 }
                // System.out.println(total);
                 System.out.println("Child Thread complted and given notifction to other thread");
                 this.notify();
             }
         }
     }

}
