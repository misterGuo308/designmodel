package com.gy.structural.flyweight;

/**
 * @author guoyou
 * @date 2019/9/19 16:48
 */
public class Manager implements  Emplovee {
    public void report() {
        System.out.println(reportContent);
    }

    private String department;

    private String reportContent;

    public Manager(String department){
        this.department=department;

    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
