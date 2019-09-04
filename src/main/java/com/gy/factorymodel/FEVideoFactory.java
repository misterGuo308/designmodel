package com.gy.factorymodel;

/**
 * @author guoyou
 * @date 2019/9/3 10:57
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
