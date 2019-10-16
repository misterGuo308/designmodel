package com.gy.structural.bridge;

/**
 * @author guoyou
 * @date 2019/9/25 10:33
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开农业银行账户");
        account.openAccount();

        return account;
    }
}
