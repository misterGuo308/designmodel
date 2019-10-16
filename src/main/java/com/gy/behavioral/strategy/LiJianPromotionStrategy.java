package com.gy.behavioral.strategy;

/**
 * @author guoyou
 * @date 2019/10/8 17:22
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("满200立减20");
    }
}
