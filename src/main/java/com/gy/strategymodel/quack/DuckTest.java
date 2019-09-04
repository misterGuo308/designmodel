package com.gy.strategymodel.quack;

import com.gy.strategymodel.duck.Duck;
import com.gy.strategymodel.duck.GreenReadDuck;
import com.gy.strategymodel.duck.RedReadDuck;
import com.gy.strategymodel.fly.NoFlyBehavioral;

/**
 * @author guoyou
 * @date 2019/8/30 16:18
 */
public class DuckTest {

    /**
     * 策略模式  把鸭子的行为单独抽离出来这样如果个别的鸭子在添加新的行为时,
     *           只需要添加特定的行为即可
     * 策略模式注意点
     *           1,分析项目中变化部分与不变部分.
     *           2.多用组合少用继承;用行为类组合,而不是行为的继承.更有弹性
     *           3.设计模式没有相应的库直接使用?有些库或框架本身就是用某种设计模式设计的
     * @param args
     */
    public static void main(String[] args) {
      Duck greenReadDuck = new GreenReadDuck();
      Duck redReadDuck = new RedReadDuck();

      greenReadDuck.display();
      greenReadDuck.fly();
      greenReadDuck.quack();

      redReadDuck.display();
      redReadDuck.fly();
      redReadDuck.quack();

        redReadDuck.display();
        redReadDuck.setFlyBehavioral(new NoFlyBehavioral());
        redReadDuck.setQuackBehavioral(new GaGaQuackBehavioral());
        redReadDuck.fly();
        redReadDuck.quack();

    }
}
