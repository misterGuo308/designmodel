package com.gy.factorymodel;

/**
 * @author guoyou
 * @date 2019/9/3 10:58
 */
public class Test {
    /**
     * 工厂方法示例
     * @param args
     */
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();
    }
}
