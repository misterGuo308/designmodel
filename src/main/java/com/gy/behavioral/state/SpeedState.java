package com.gy.behavioral.state;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author guoyou
 * @date 2019/10/15 15:26
 */
public class SpeedState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进状态播放课程视频");
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
