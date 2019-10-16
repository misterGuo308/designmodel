package com.gy.structural.proxy.dynamicproxy;

/**
 * @author guoyou
 * @date 2019/9/26 15:39
 */
public class Cat implements Animal {

    public void action(String name) {
        System.out.println(name+"猫..........喵喵喵");
    }


    public void breath(String name) {
        System.out.println(name+"猫........呼吸新鲜空气");
    }
}
