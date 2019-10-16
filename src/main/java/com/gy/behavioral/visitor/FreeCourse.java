package com.gy.behavioral.visitor;

/**
 * @author guoyou
 * @date 2019/10/15 14:47
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visitor(this);
    }
}
