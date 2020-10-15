package com.xuecheng.framework.Multithreading;

public class MiThread extends  Thread {
    private  int i ;
    public   MiThread(Integer i){
     this.i = i;
    }

    @Override
    public void run() {
       synchronized (this) {
        System.out.println(this.getName() + ": " + --i);
       }
    }

    public static void main(String[] args) throws InterruptedException {
        MiThread m1 = new MiThread(5);
        MiThread m2 = new MiThread(6);
        MiThread m3 = new MiThread(7);
        m1.start();
        m2.start();
        m3.start();

    }



}
