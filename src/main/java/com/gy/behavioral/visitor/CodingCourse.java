package com.gy.behavioral.visitor;

/**
 * @author guoyou
 * @date 2019/10/15 14:51
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visitor(this);
    }
}
