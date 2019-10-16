package com.gy.behavioral.mediator;

/**
 * @author guoyou
 * @date 2019/10/15 10:36
 */
public class StudyGroup {

    public static  void showMessage(User user ,String message){
        System.out.println(user.getName()+"发送的消息为"+message);
    }
}
