package com.gy.structural.adapter.classadapter;

/**
 * @author guoyou
 * @date 2019/9/19 14:41
 */
public class Adapter extends Adapree implements  Target {
    public void request() {
        super.adapteeRequest();
    }
}
