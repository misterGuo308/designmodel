package com.gy.behavioral.command;

/**
 * @author guoyou
 * @date 2019/10/14 17:14
 */
public class CloseCourseVideo implements Command {

    private  CourseVideo courseVideo;

    public CloseCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.close();
    }
}
