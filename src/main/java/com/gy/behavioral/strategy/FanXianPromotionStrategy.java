package com.gy.behavioral.strategy;

/**
 * @author guoyou
 * @date 2019/10/8 17:24
 */
public class FanXianPromotionStrategy  implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("满500返现50");
    }
}
