package com.gy.behavioral.command;

/**
 * @author guoyou
 * @date 2019/10/14 17:21
 */
public class Test {
    /**
     * 命令模式
     * @param args
     */
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java命令模式");
        OpenCourseVideo openCourseVideo = new OpenCourseVideo(courseVideo);
        CloseCourseVideo closeCourseVideo = new CloseCourseVideo(courseVideo);

        Satff satff = new Satff();

        satff.addCommand(openCourseVideo);
        satff.addCommand(closeCourseVideo);
        satff.executeCommand();
    }
}
