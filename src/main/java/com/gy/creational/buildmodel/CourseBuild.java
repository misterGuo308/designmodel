package com.gy.creational.buildmodel;

/**
 * @author guoyou
 * @date 2019/9/4 10:33
 */
public abstract class CourseBuild {


    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQa(String courseQa);

    public abstract  Course makeCourse();
}
