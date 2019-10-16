package com.gy.creational.singleton;

/**
 * @author guoyou
 * @date 2019/9/6 16:03
 */
public class LazyDoubleCheckSingleton {


    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton;


    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {

        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给对象
                    //2.初始化对象
                    //3设置lazyDoubleCheckSingleton指向的内存地址
                    //上述2,3步骤会出现重排序的问题  当多线程时出现2,3步骤重排序.
                    // 例如现在有两个线程   当A线程执行完1,3步骤时候.
                    // 那么B线程这是刚好来到19行的if判断那么lazyDoubleCheckSingleton就不为空.
                    // 但将lazyDoubleCheckSingleton返回时候还没有初始化所以会出现问题.

                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
