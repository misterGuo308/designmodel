package com.gy.structural.bridge;

/**
 * @author guoyou
 * @date 2019/9/25 10:29
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;

    }

    public abstract Account openAccount();
}
