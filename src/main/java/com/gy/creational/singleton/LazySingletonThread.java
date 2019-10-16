package com.gy.creational.singleton;

/**
 * @author guoyou
 * @date 2019/9/5 15:45
 */
public class LazySingletonThread implements Runnable {


    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();

        System.out.println("当前的线程为:"+Thread.currentThread().getName()+"当前实体为:"+instance);
    }
}
