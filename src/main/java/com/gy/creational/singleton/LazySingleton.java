package com.gy.creational.singleton;

/**
 * @author guoyou
 * @date 2019/9/5 14:58
 */
public class LazySingleton {


    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public   static LazySingleton getInstance() {
        synchronized(LazySingleton.class){
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }

        return lazySingleton;
    }
}
