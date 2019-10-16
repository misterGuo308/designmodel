package com.gy.structural.decorator.v2;

/**
 * @author guoyou
 * @date 2019/9/18 15:06
 * 创建煎饼装饰者
 */
public class AbstractDecorator extends Apancake {


    private Apancake apancake;

    public AbstractDecorator(Apancake apancake) {
        this.apancake = apancake;
    }

    @Override
    protected String getDesc() {
        return apancake.getDesc();
    }

    @Override
    protected Integer cost() {
        return apancake.cost();
    }
}
