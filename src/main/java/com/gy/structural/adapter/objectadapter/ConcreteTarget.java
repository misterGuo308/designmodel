package com.gy.structural.adapter.objectadapter;

/**
 * @author guoyou
 * @date 2019/9/19 14:55
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("目标方法");
    }
}
