package com.gy.structural.decorator.v2;

/**
 * @author guoyou
 * @date 2019/9/18 15:09
 * 加蛋煎饼
 */
public class PancakeWithEgg  extends AbstractDecorator {
    public PancakeWithEgg(Apancake apancake) {
        super(apancake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个蛋";
    }

    @Override
    protected Integer cost() {
        return super.cost()+1;
    }
}
