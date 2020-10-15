package com.xuecheng.framework.Multithreading;

import lombok.SneakyThrows;

public class DeathlyLockThread implements  Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    private  Integer lock;
    private  Object  o1 = new Object(), o2 = new Object();
    public   DeathlyLockThread(Integer lock){
        this.lock = lock;
    }



    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "：此时 lock = " + lock);
        if(lock == 1){
            synchronized (o1){
                try {
                    System.out.println("我是" + Thread.currentThread().getName() + "锁住 o1");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "醒来->准备获取 o2");
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "拿到 o2");//第24行
                }
            }
        }
        if(lock == 0){
            synchronized (o2){
                try {
                    System.out.println("我是" + Thread.currentThread().getName() + "锁住 o2");
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + "醒来->准备获取 o1");
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "拿到 o1");//第38行
                }
            }
        }
    }

    public static  void main(String args[]){

        DeathlyLockThread t1 = new DeathlyLockThread(1);
        DeathlyLockThread t2 = new DeathlyLockThread(0);

        new Thread(t1).start();
        new Thread(t2).start();
        //让main线程休眠1秒钟,保证t2开启锁住o2.进入死锁



    }
}
