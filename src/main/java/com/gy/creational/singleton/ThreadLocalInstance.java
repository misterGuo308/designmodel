package com.gy.creational.singleton;

/**
 * @author guoyou
 * @date 2019/9/16 10:47
 *
 * 基于当前线程的单例模式
 */
public class ThreadLocalInstance {


    private static  final ThreadLocal<ThreadLocalInstance> threadLocal= new ThreadLocal<ThreadLocalInstance>(){

        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }

    };

    private ThreadLocalInstance(){

    }

    public static  ThreadLocalInstance getInstance(){

        return threadLocal.get();

    }
}
