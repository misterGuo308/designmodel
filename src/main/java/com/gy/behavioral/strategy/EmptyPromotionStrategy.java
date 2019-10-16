package com.gy.behavioral.strategy;

/**
 * @author guoyou
 * @date 2019/10/9 14:21
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("没有促销!");
    }
}
