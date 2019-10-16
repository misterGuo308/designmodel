package com.gy.structural.proxy.dynamicproxy;

/**
 * @author guoyou
 * @date 2019/9/26 16:52
 */
public class Test {

    /**
     * 动态代理
     * @param args
     */
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy(new Cat());
        Animal animal =(Animal) dynamicProxy.bind();
        animal.action("Tom");
        animal.breath("Tom");

    }
}
