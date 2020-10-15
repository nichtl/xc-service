package com.xuecheng.framework.Multithreading;

public class MiRunnable implements Runnable {
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
     *
     */
    private  int i ;
    public  MiRunnable (Integer i){
        this.i = i;
    }
    @Override
    public void run() {
        for (int j = 0; j < i; j++) {
            System.out.println(Thread.currentThread().getName()+": "+j);
        }
    }

    public static void main(String[] args) {
        Thread  ST = new Thread();
        MiRunnable mr1 = new MiRunnable(5);
        MiRunnable mr2 = new MiRunnable(6);
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.start();
        t2.start();


    }



}
