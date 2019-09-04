package com.gy.abstractfactory;

/**
 * @author guoyou
 * @date 2019/9/4 9:46
 */
public class PythonCourseFactory extends  CourseFactory {
    @Override
    public Article article() {
        return new PythonArticle();
    }
@Override
    public Video video() {
        return  new PythonVideo();
    }
}
