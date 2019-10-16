package com.gy.structural.bridge;

/**
 * @author guoyou
 * @date 2019/9/25 10:26
 */
public class DepositAccount implements Account {
    public void openAccount() {
        System.out.println("打开定期存款账户");
    }

    public void showAccount() {

        System.out.println("显示定期存款账户");

    }
}
