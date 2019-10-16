package com.gy.structural.facade;

/**
 * @author guoyou
 * @date 2019/9/16 17:28
 */
public class Test {
    /**
     * 外观模式
     * @param args
     */
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift();
        pointsGift.setName("礼物");
        GifeExchangeService gifeExchangeService =new GifeExchangeService();
        gifeExchangeService.giftExchange(pointsGift);
    }
}
