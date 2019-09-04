package com.gy.buildmodel.v2;

/**
 * @author guoyou
 * @date 2019/9/4 16:21
 */
public class Course {


    private String courseName;

    private String coursePPT;

    private String video;

    private String article;

    private String qa;

    public Course( CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT=courseBuilder.coursePPT;
        this.article=courseBuilder.article;
        this.video=courseBuilder.video;
        this.qa=courseBuilder.qa;

    }

    public static class  CourseBuilder{
        private String courseName;

        private String coursePPT;

        private String video;

        private String article;

        private String qa;



        public CourseBuilder builderCourseName(String courseName){
            this.courseName=courseName;
            return this;
        }

        public CourseBuilder builderCoursePPT(String coursePPT){
            this.coursePPT=coursePPT;
            return this;
        }
        public CourseBuilder builderCourseArticle(String article){
            this.article=article;
            return this;
        }
        public CourseBuilder builderCourseVideo(String video){
            this.video=video;
            return this;
        }
        public CourseBuilder builderCourseQa(String qa){
            this.qa=qa;
            return this;
        }
        public Course builder(){
            return new Course(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", qa='" + qa + '\'' +
                '}';
    }
}
