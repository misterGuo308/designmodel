package com.gy.behavioral.strategy;

/**
 * @author guoyou
 * @date 2019/10/9 14:06
 */
public class PromotionActivity {


    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;

    }
    public void executePromotion() {
        promotionStrategy.doPromotion();
    }
}
