package com.gy.structural.facade;

/**
 * @author guoyou
 * @date 2019/9/16 17:16
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分资格通过");

        return true;
    }
}



