package com.gy.structural.composite;

/**
 * @author guoyou
 * @date 2019/9/20 14:59
 */
public class Test {
    /**
     * 组合模式
     *
     * @param args
     */
    public static void main(String[] args) {
        CatalogComponent linux = new Course("linux课程", 2000);
        CatalogComponent windows = new Course("windows课程", 2000);
        CatalogComponent java = new Course("java课程", 2000);
        CatalogComponent javaDesign = new Course("java设计模式", 211);
        CatalogComponent javaBase = new Course("java基础", 122);
        CatalogComponent javaweb = new Course("javaweb", 311);
        CatalogComponent javaObject = new Course("java项目实战", 455);
        CatalogComponent catalog2 = new CourseCatalog("java目录", 2);
        catalog2.add(java);
        catalog2.add(javaBase);
        catalog2.add(javaDesign);
        catalog2.add(javaweb);
        catalog2.add(javaObject);

        CatalogComponent catalog = new CourseCatalog("课程目录", 1);
        catalog.add(linux);
        catalog.add(windows);
        catalog.add(catalog2);

        catalog.print();
    }
}
