package com.gy.structural.composite;

/**
 * @author guoyou
 * @date 2019/9/20 10:59
 * 课程
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程的名称为:" + name + "课程的价格为" + price + "元");
    }
}
