package com.gy.creational.factorymodel;

/**
 * @author guoyou
 * @date 2019/9/3 10:56
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
