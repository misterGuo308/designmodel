package com.gy.behavioral.chainofresponsibility;

/**
 * @author guoyou
 * @date 2019/10/15 10:54
 * 批准者
 */
public abstract class Approver {

    protected Approver approver;

    public void  setNextApprover(Approver approver){
        this.approver=approver;
    }

    public abstract void deploy(Course course);
}
