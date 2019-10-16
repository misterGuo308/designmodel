package com.gy.creational.buildmodel;

/**
 * @author guoyou
 * @date 2019/9/4 10:29
 */
public class Course {

    private String CourseName;

    private String CoursePPT;

    private String video;

    private String article;

    private String qa;

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCoursePPT() {
        return CoursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        CoursePPT = coursePPT;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + CourseName + '\'' +
                ", CoursePPT='" + CoursePPT + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", qa='" + qa + '\'' +
                '}';
    }
}
