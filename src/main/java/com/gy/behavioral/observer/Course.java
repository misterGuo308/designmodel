package com.gy.behavioral.observer;

import java.util.Observable;

/**
 * @author guoyou
 * @date 2019/10/10 9:46
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void  produceQuestion(Course course ,Question question){
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"提交了一个问题");
        setChanged();
        notifyObservers(question);

    }
}
