package com.gy.behavioral.strategy;

/**
 * @author guoyou
 * @date 2019/10/9 14:26
 */
public class Test {
    /**
     * 使用PromotionActivity是策略模式
     * 使用PromotionStrategyFactoty为策略模式与工厂模式的叠加使用
     *
     * @param args
     */
    public static void main(String[] args) {

     PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("LIJIANww"));
     promotionActivity.executePromotion();

    }
}
