package com.gy.structural.decorator.v2;

/**
 * @author guoyou
 * @date 2019/9/18 15:05
 */
public class Pancake extends Apancake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected Integer cost() {
        return 5;
    }
}
