package com.gy.strategymodel.duck;

import com.gy.strategymodel.fly.GoodFlyBehavioral;
import com.gy.strategymodel.quack.GeGeQuackBehavioral;

/**
 * @author guoyou
 * @date 2019/8/30 16:12
 */
public class RedReadDuck extends Duck {

    public RedReadDuck() {
        quackBehavioral = new GeGeQuackBehavioral();
        flyBehavioral = new GoodFlyBehavioral();
    }

    @Override
    public void display() {
        System.out.println("*********greenHeadDuck*********");
    }
}
