package com.gy.behavioral.state;

/**
 * @author guoyou
 * @date 2019/10/15 15:29
 */
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("停止状态不能快进");
    }

    @Override
    public void pause() {
        System.out.println("停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放课程视频");
    }
}
