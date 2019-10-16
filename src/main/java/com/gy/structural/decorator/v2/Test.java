package com.gy.structural.decorator.v2;

/**
 * @author guoyou
 * @date 2019/9/18 15:13
 */
public class Test {

    /**
     * 装饰者
     * 这种状态下可以满足在
     * @param args
     */
    public static void main(String[] args) {
        Apancake apancake;

        apancake =new Pancake();
        System.out.println("普通煎饼:"+apancake.getDesc()+apancake.cost());

        apancake =new PancakeWithEgg(apancake);
        System.out.println("加一个蛋煎饼:"+apancake.getDesc()+apancake.cost());

        apancake =new PancakeWithEgg(apancake);
        System.out.println("加两个蛋煎饼:"+apancake.getDesc()+apancake.cost());

        apancake =new PancakeWithSausage(apancake);
        System.out.println("加两个蛋加一个肠煎饼:"+apancake.getDesc()+apancake.cost());
    }
}
