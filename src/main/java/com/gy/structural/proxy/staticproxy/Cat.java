package com.gy.structural.proxy.staticproxy;

/**
 * @author guoyou
 * @date 2019/9/26 15:39
 */
public class Cat extends Animal {
    @Override
    public void action() {
        System.out.println("猫..........喵喵喵");
    }

    @Override
    public void breath() {
        System.out.println("猫........呼吸新鲜空气");
    }
}
