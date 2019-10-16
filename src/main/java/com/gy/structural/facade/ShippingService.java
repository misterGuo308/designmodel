package com.gy.structural.facade;

/**
 * @author guoyou
 * @date 2019/9/16 17:21
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"物流服务");
        return "52364547568795847362";
    }
}
