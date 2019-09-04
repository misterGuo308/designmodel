package com.gy.buildmodel.v2;

/**
 * @author guoyou
 * @date 2019/9/4 16:35
 */
public class Test {
    /**
     * 链式建造者模式
     * @param args
     */
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .builderCourseName("名称")
                .builderCourseArticle("笔记")
                .builderCoursePPT("ppt")
                .builderCourseQa("反馈")
                .builderCourseVideo("视频")
                .builder();
        System.out.println(course);
    }
}
