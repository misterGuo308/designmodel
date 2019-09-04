package com.gy.abstractfactory;

/**
 * @author guoyou
 * @date 2019/9/4 9:37
 */
public class JavaCourseFactory  extends CourseFactory{

    @Override
    public Article article() {
        return  new JavaArticle();
    }
    @Override
    public Video video() {
        return new JavaVideo();
    }
}
