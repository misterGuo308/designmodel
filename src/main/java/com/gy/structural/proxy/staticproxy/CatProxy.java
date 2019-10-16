package com.gy.structural.proxy.staticproxy;

/**
 * @author guoyou
 * @date 2019/9/26 15:41
 */
public class CatProxy extends Animal {

    private Cat cat;


    public CatProxy(Cat cat) {

        this.cat = cat;
    }


    @Override
    public void action() {
        System.out.println("before......增强");
        cat.action();
        System.out.println("after.......增强");

    }

    @Override
    public void breath() {
        System.out.println("before......增强");
        cat.breath();
        System.out.println("after.......增强");


    }
}
