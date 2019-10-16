package com.gy.behavioral.templatemethod;

/**
 * @author guoyou
 * @date 2019/9/27 15:48
 */
public class Test {

    public static void main(String[] args) {
        ACourse course = new FECourse(false);
        course.makeCourse();

        ACourse     course2 = new DesignModeCourse();

        course2.makeCourse();
    }

}
