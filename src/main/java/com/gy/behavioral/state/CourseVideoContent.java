package com.gy.behavioral.state;

/**
 * @author guoyou
 * @date 2019/10/15 15:22
 */
public class CourseVideoContent {
    private CourseVideoState courseVideoState;
    public final static  PlayState PLAY_STATE =new PlayState();
    public final static  StopState STOP_STATE =new StopState();
    public final static  PauseState PAUSE_STATE =new PauseState();
    public final static  SpeedState SPEED_STATE =new SpeedState();

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContent(this);
    }

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public  void  play(){
        this.courseVideoState.play();

    }

    public  void  stop(){
        this.courseVideoState.stop();

    }
    public  void  pause(){
        this.courseVideoState.pause();

    }
    public  void  speed(){
        this.courseVideoState.speed();

    }
}
