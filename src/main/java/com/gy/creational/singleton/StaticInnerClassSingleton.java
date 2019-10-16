package com.gy.creational.singleton;

/**
 * @author guoyou
 * @date 2019/9/9 14:27
 */
public class StaticInnerClassSingleton {


    private static class InnerSingleton {

        public static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerSingleton.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton() {
        if(InnerSingleton.staticInnerClassSingleton!=null){
            throw  new RuntimeException("单例模式禁止反射");
        }

    }

}
