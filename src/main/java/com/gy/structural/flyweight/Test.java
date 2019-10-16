package com.gy.structural.flyweight;

/**
 * @author guoyou
 * @date 2019/9/19 16:59
 */
public class Test {

    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    /**
     * 享元模式
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            int i1 = (int) (Math.random() * departments.length);
            String department =departments[(int)(Math.random()*departments.length)];

            Emplovee manager = EmploveeFactory.getManager(department);
            manager.report();
        }
    }
}
