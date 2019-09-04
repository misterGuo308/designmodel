package com.gy.strategymodel.fly;

/**
 * @author guoyou
 * @date 2019/8/30 15:59
 */
public class NoFlyBehavioral implements FlyBehavioral {
    public void fly() {
        System.out.println("*******NoFly***********");
    }
}
