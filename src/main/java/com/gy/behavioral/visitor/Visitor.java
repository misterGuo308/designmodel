package com.gy.behavioral.visitor;

/**
 * @author guoyou
 * @date 2019/10/15 14:54
 */
public class Visitor implements IVisitor {
    public void visitor(FreeCourse freeCourse) {
        System.out.println("免费课程为"+freeCourse.getName());
    }

    public void visitor(CodingCourse codingCourse) {
        System.out.println("实战课程"+codingCourse.getName()+"价格为"+codingCourse.getPrice());
    }
}
