package com.gy.behavioral.observer;

/**
 * @author guoyou
 * @date 2019/10/10 10:00
 */
public class Test {
    /**
     * 观察者设计模式
     * @param args
     */
    public static void main(String[] args) {

        Course course = new Course("java设计模式观察者");
        Teacher teacher = new Teacher("菲菲");
        Teacher teacher1 = new Teacher("坤坤");
        course.addObserver(teacher);
        course.addObserver(teacher1);
        Question question = new Question();
        question.setUserName("gy同学");
        question.setQuestionContent("观察者怎么写");
        course.produceQuestion(course, question);
    }
}
