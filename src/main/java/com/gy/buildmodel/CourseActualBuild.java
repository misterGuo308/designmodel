package com.gy.buildmodel;

/**
 * @author guoyou
 * @date 2019/9/4 10:39
 */
public class CourseActualBuild extends CourseBuild {

    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        this.course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        this.course.setVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        this.course.setArticle(courseArticle);
    }

    @Override
    public void buildCourseQa(String courseQa) {
        this.course.setQa(courseQa);
    }

    @Override
    public Course makeCourse() {
        return this.course;
    }
}
