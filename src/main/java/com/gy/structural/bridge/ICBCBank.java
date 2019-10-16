package com.gy.structural.bridge;

/**
 * @author guoyou
 * @date 2019/9/25 10:31
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开ICBC账户");
        account.openAccount();
        return account;
    }
}
