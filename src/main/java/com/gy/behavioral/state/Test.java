package com.gy.behavioral.state;

/**
 * @author guoyou
 * @date 2019/10/15 15:49
 */
public class Test {
    /**
     * 状态模式
     * @param args
     */
    public static void main(String[] args) {
        CourseVideoContent courseVideoContent = new CourseVideoContent();
        courseVideoContent.setCourseVideoState(new PlayState());
        System.out.println("当前状态"+courseVideoContent.getCourseVideoState().getClass().getSimpleName());
        courseVideoContent.pause();
        System.out.println("当前状态"+courseVideoContent.getCourseVideoState().getClass().getSimpleName());
        courseVideoContent.stop();
        System.out.println("当前状态"+courseVideoContent.getCourseVideoState().getClass().getSimpleName());
        courseVideoContent.speed();
        System.out.println("当前状态"+courseVideoContent.getCourseVideoState().getClass().getSimpleName());

    }
}
