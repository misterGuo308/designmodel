package com.gy.structural.adapter.objectadapter;

/**
 * @author guoyou
 * @date 2019/9/19 14:56
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();
    }
}
