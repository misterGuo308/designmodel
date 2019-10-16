package com.gy.behavioral.command;

/**
 * @author guoyou
 * @date 2019/10/14 17:10
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + "课程开放");

    }

    public void close() {
        System.out.println(name + "课程关闭");
    }
}
