package com.gy.structural.decorator.v1;

/**
 * @author guoyou
 * @date 2019/9/18 14:45
 */
public class PancakeWithEgg extends Pancake{
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public Integer cost() {
        return super.cost()+1;
    }
}
