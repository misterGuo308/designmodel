package com.gy.structural.facade;

/**
 * @author guoyou
 * @date 2019/9/16 17:20
 */
public class PointsPaymentService {


    public boolean pay(PointsGift pointsGift){

        System.out.println(pointsGift.getName()+"积分支付成功");
        return true;
    }
}
