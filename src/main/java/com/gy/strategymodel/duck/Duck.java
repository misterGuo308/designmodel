package com.gy.strategymodel.duck;

import com.gy.strategymodel.fly.FlyBehavioral;
import com.gy.strategymodel.quack.QuackBehavioral;

/**
 * @author guoyou
 * @date 2019/8/30 16:05
 */
public abstract class Duck {

       FlyBehavioral flyBehavioral;

       QuackBehavioral quackBehavioral;

    public Duck() {
    }
    /**
     * 什么样的鸭子
     */
    public  abstract void  display();


    public  void  fly(){
        flyBehavioral.fly();
    }

    public void  quack(){
        quackBehavioral.quack();
    }

    public void setFlyBehavioral(FlyBehavioral fly) {
        this.flyBehavioral = fly;
    }

    public void setQuackBehavioral(QuackBehavioral quack) {
        this.quackBehavioral = quack;
    }
}
