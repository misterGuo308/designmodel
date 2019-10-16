package com.gy.structural.bridge;

/**
 * @author guoyou
 * @date 2019/9/25 10:28
 */
public class SavingAccount implements Account {
    public void openAccount() {
        System.out.println("打开储蓄账号");
    }

    public void showAccount() {
        System.out.println("这是一个储蓄账号");
    }
}
