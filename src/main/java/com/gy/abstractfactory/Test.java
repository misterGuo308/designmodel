package com.gy.abstractfactory;

/**
 * @author guoyou
 * @date 2019/9/4 9:48
 */
public class Test {
    /**
     * 抽象工厂
     * @param args
     */
    public static void main(String[] args) {
        JavaCourseFactory java = new JavaCourseFactory();
        PythonCourseFactory python = new PythonCourseFactory();
        java.article().product();
        java.video().product();
        python.video().product();
        python.article().product();

    }
}
