package com.gy.behavioral.templatemethod;

/**
 * @author guoyou
 * @date 2019/9/27 15:41
 */
public class FECourse extends ACourse {

    private Boolean flag =false;


    public FECourse(Boolean flag){
        this.flag=flag;
    }
    @Override
    public void packageCourse() {
        System.out.println("前端课程");
    }

    @Override
    public Boolean needWriteArticle() {
        return flag;
    }

}
