package com.gy.behavioral.command;

/**
 * @author guoyou
 * @date 2019/10/14 17:13
 */
public class OpenCourseVideo implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.open();
    }
}
