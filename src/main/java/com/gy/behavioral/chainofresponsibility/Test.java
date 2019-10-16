package com.gy.behavioral.chainofresponsibility;

/**
 * @author guoyou
 * @date 2019/10/15 11:15
 */
public class Test {
    /**
     * 责任链设计模式
     * @param args
     */
    public static void main(String[] args) {
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("java责任链设计模式");
      //  course.setArticle("手记");
        course.setVideo("视频");
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
