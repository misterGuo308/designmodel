package com.gy.structural.decorator.v1;

/**
 * @author guoyou
 * @date 2019/9/18 14:50
 */
public class Test {
    /**
     * 现有业务需求如下:
     * 有一个做煎饼的摊位,单独煎饼5元,加蛋6元,加蛋加肠8元.
     * v1 为传统模式的做法;
     * 反思:假如这个小朋友要加两个蛋或两根肠呢?
     * 这种做法有一个问题,将来要是在加组合的话就必须要重新写一个类去实现该组合.
     * 那么可以使用装饰者模式去解决这个问题.如v2版本
     * @param args
     */
    public static void main(String[] args) {
        Pancake pancake = new PancakeWithEggSausage();
        System.out.println("加肠加蛋的煎饼:  "+pancake.getDesc()+pancake.cost());


         pancake = new PancakeWithEgg();
        System.out.println("加蛋的煎饼:  "+pancake.getDesc()+pancake.cost());


        pancake = new Pancake();
        System.out.println("煎饼:  "+pancake.getDesc()+pancake.cost());
    }
}
