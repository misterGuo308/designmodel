package com.gy.buildmodel;

/**
 * @author guoyou
 * @date 2019/9/4 10:44
 */
public class Coach {

    private CourseBuild courseBuild;

    public void setCourseBuild(CourseBuild courseBuild) {
        this.courseBuild = courseBuild;
    }

    public Course makeCourse(String courseName, String courPPT, String courVideo, String courseArticle, String courseQa) {
        this.courseBuild.buildCourseName(courseName);
        this.courseBuild.buildCoursePPT(courPPT);
        this.courseBuild.buildCourseArticle(courseArticle);
        this.courseBuild.buildCourseVideo(courVideo);
        this.courseBuild.buildCourseQa(courseQa);
        return  this.courseBuild.makeCourse();
    }
}
