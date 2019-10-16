package com.gy.structural.adapter.classadapter;

/**
 * @author guoyou
 * @date 2019/9/19 14:43
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("目标方法");
    }
}
