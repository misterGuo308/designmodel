package com.gy.behavioral.mediator;

/**
 * @author guoyou
 * @date 2019/10/15 10:42
 */
public class Test {

    /**
     * 中介者模式
     * @param args
     */
    public static void main(String[] args) {
        User user = new User("tom");
        User user1 = new User("小米");
        user.sendMessage("你好");
        user1.sendMessage("我不好");
    }
}
