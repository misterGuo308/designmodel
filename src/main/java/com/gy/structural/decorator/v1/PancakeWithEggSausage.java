package com.gy.structural.decorator.v1;

/**
 * @author guoyou
 * @date 2019/9/18 14:49
 */
public class PancakeWithEggSausage extends PancakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    public Integer cost() {
        return super.cost()+2;
    }
}
