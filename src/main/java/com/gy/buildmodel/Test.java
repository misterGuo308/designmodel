package com.gy.buildmodel;

/**
 * @author guoyou
 * @date 2019/9/4 10:55
 */
public class Test {

    public static void main(String[] args) {

    CourseBuild courseBuild =    new CourseActualBuild();

    Coach coach =new Coach();

    coach.setCourseBuild(courseBuild);

        Course course = coach.makeCourse("java-name", "java-ppt", "java-video", "java-article", "java-qa");

        System.out.println(course);

    }
}
