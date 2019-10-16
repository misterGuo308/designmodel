package com.gy.structural.decorator.v2;

/**
 * @author guoyou
 * @date 2019/9/18 15:12
 * 加肠煎饼
 */
public class PancakeWithSausage extends AbstractDecorator {
    public PancakeWithSausage(Apancake apancake) {
        super(apancake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected Integer cost() {
        return super.cost() + 2;
    }
}
