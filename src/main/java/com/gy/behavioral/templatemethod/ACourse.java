package com.gy.behavioral.templatemethod;

/**
 * @author guoyou
 * @date 2019/9/27 15:33
 * 课程
 */
public abstract class ACourse {

    protected final void makeCourse() {
        this.makePPT();
        if (this.needWriteArticle()) {
            this.writeArticle();

        }
        this.packageCourse();
    }

    public final void makePPT() {
        System.out.println("课程ppt");

    }

    /**
     * 手记
     */
    public final void writeArticle() {
        System.out.println("课程手记");
    }

    /**
     * 钩子函数
     *
     * @return
     */
    public Boolean needWriteArticle() {
        return false;
    }

    public abstract void packageCourse();

}
