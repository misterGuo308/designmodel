package com.gy.factorymodel;

/**
 * @author guoyou
 * @date 2019/9/3 10:56
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
