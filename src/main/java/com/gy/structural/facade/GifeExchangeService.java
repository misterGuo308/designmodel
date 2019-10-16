package com.gy.structural.facade;

/**
 * @author guoyou
 * @date 2019/9/16 17:24
 */
public class GifeExchangeService {

    private PointsPaymentService pointsPaymentService =new PointsPaymentService();

    private  QualifyService qualifyService =new QualifyService();

    private  ShippingService shippingService =new ShippingService();


    public  void  giftExchange(PointsGift pointsGift){

        if(qualifyService.isAvailable(pointsGift)){
            if(pointsPaymentService.pay(pointsGift)){
                String shipGift = shippingService.shipGift(pointsGift);
                System.out.println("订单号为"+shipGift);
            }

        }

    }
}
