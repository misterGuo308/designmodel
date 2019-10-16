package com.gy.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author guoyou
 * @date 2019/10/10 9:49
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public void update(Observable o, Object arg) {
        Course course =(Course)o;
        Question question =(Question)arg;

        System.out.println(teacherName+"的"+course.getCourseName()+"课程收到"+question.getUserName()+"发布的问题;问题的内容为"+question.getQuestionContent());
    }
}
