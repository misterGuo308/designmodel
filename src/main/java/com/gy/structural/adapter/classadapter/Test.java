package com.gy.structural.adapter.classadapter;

/**
 * @author guoyou
 * @date 2019/9/19 14:45
 */
public class Test {

    /**
     * 类适配器模式
     * @param args
     */
    public static void main(String[] args) {

        Target target = new Adapter();

        target.request();
        target =new ConcreteTarget();
        target.request();
    }
}
