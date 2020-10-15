package com.xuecheng.framework.Multithreading;

public class ThreadTest {

    public static void main(String[] args) {
        DeathlyLockThread d1 = new DeathlyLockThread(1);
        DeathlyLockThread d2 = new DeathlyLockThread(2);
        Thread t1 = new Thread(d1,"d1");
        Thread t2 = new Thread(d2,"d2");
        t1.start();
        t2.start();
    }
}
