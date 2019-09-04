package com.gy.strategymodel.duck;

import com.gy.strategymodel.fly.NoFlyBehavioral;
import com.gy.strategymodel.quack.GaGaQuackBehavioral;

/**
 * @author guoyou
 * @date 2019/8/30 16:12
 */
public class GreenReadDuck extends Duck {

    public GreenReadDuck() {
        quackBehavioral = new GaGaQuackBehavioral();
        flyBehavioral = new NoFlyBehavioral();
    }

    @Override
    public void display() {
        System.out.println("*********greenHeadDuck*********");
    }
}
