package com.xuecheng.framework.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MiCallable implements Callable<String> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    private  Integer i;
    public  MiCallable(Integer i){
     this.i = i;
    }

    @Override
    public String call() throws Exception {
        for (int j = 0; j < i; j++) {
            System.out.println( Thread.currentThread().getName()+": "+j);
        }
        return "Hello tom";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MiCallable   mc= new MiCallable(5);
        FutureTask<String> futureTask = new FutureTask<>(mc);
       Thread  t1 =  new Thread(futureTask,"t1");
       Thread  t2 =  new Thread(futureTask,"t2");
       t1.start();
       t2.start();
       System.out.println(futureTask.get());

    }
}
