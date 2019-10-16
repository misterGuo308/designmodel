package com.gy.behavioral.state;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author guoyou
 * @date 2019/10/15 15:27
 */
public class PauseState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.SPEED_STATE);

    }

    @Override
    public void pause() {
        System.out.println("暂停播放课程视频");

    }

    @Override
    public void stop() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.STOP_STATE);
    }
}
