package com.gy.creational.prototype;

import java.text.MessageFormat;

/**
 * @author guoyou
 * @date 2019/9/16 14:25
 */
public class MailUtils {


    public  static  void  sandMail(Mail mail){
        String outputContent ="向:{0}同学,邮件地址:{1},邮件内容:{2}发送邮件";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getAddress(),mail.getContent()));

    }

    public static  void  saveOriginMailRecord(Mail mail){
        System.out.println("存储的origin mail record :"+mail.getContent());
    }
}
