package com.gy.behavioral.visitor;

import java.util.ArrayList;

/**
 * @author guoyou
 * @date 2019/10/15 14:58
 */
public class Test {
    /**
     * 访问者模式
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("+免费课程+");

        CodingCourse codingCourse = new CodingCourse();

        codingCourse.setName("收费课程");
        codingCourse.setPrice(200);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {

            course.accept(new Visitor());
        }
    }
}
