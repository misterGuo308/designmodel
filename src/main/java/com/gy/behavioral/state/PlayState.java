package com.gy.behavioral.state;

/**
 * @author guoyou
 * @date 2019/10/15 15:22
 */
public class PlayState extends CourseVideoState {


    @Override
    public void play() {
        System.out.println("正常状态播放课程视频");
    }

    @Override
    public void speed() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.SPEED_STATE);

    }

    @Override
    public void pause() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.STOP_STATE);
    }
}
