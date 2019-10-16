package com.gy.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyou
 * @date 2019/10/9 14:10
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap();

    private static final PromotionStrategy NON_EMPTYPROMOTIONSTRATEGY = new EmptyPromotionStrategy();


    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LiJian, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FanXian, new FanXianPromotionStrategy());
    }


    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);

        return promotionStrategy == null ? NON_EMPTYPROMOTIONSTRATEGY : promotionStrategy;

    }

    private interface PromotionKey {
        String LiJian = "LIJIAN";
        String FanXian = "FANXIAN";
    }
}
