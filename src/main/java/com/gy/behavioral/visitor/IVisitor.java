package com.gy.behavioral.visitor;

/**
 * @author guoyou
 * @date 2019/10/15 14:49
 */
public interface IVisitor {


    void visitor(FreeCourse freeCourse);

    void visitor(CodingCourse codingCourse);
}
