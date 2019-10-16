package com.gy.creational.prototype;

/**
 * @author guoyou
 * @date 2019/9/16 14:33
 */
public class Test {
    /**
     * 原型
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化mail"+mail.toString());
        for (int i = 0; i < 10; i++) {
            Mail tempMail = (Mail) mail.clone();
            tempMail.setName("张" + i);
            tempMail.setAddress("XXX.126@.com");
            tempMail.setContent("你好请查收!!");
            MailUtils.sandMail(mail);
            System.out.println("克隆tempMail"+ tempMail.toString());

        }
        MailUtils.saveOriginMailRecord(mail);


    }
}
