package com.gy.behavioral.visitor;

/**
 * @author guoyou
 * @date 2019/10/15 14:46
 */
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void accept(IVisitor iVisitor);
}
