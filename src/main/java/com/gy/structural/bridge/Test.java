package com.gy.structural.bridge;

/**
 * @author guoyou
 * @date 2019/9/25 10:35
 */
public class Test {
    /**
     * 桥接模式
     * @param args
     */
    public static void main(String[] args) {
       Bank icbcBank = new ICBCBank(new SavingAccount());
        Account account = icbcBank.openAccount();
        account.showAccount();

        Bank abcBank = new ABCBank(new DepositAccount());
        Account depositAccount = abcBank.openAccount();
        depositAccount.showAccount();


    }
}
