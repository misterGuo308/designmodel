package com.gy.behavioral.state;

import com.gy.behavioral.command.CourseVideo;

/**
 * @author guoyou
 * @date 2019/10/15 15:17
 */
public abstract class CourseVideoState {


    protected CourseVideoContent courseVideoContent;

    public void setCourseVideoContent(CourseVideoContent courseVideoContent) {
        this.courseVideoContent = courseVideoContent;
    }

    /**
     * 播放
     */
    public abstract void play();

    /**
     * 快进
     */
    public abstract void speed();

    /**
     * 暂停
     */
    public abstract void pause();

    /**
     * 停止
     */
    public abstract void stop();
}
