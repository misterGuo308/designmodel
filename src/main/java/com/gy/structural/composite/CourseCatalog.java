package com.gy.structural.composite;

import java.util.ArrayList;

/**
 * @author guoyou
 * @date 2019/9/20 11:03
 * 课程目录
 */
public class CourseCatalog extends CatalogComponent {


    private ArrayList<CatalogComponent> items = new ArrayList<CatalogComponent>();

    private String name;

    private  Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level=level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {

        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if (level!=null){
                for (int i = 0; i <level ; i++) {
                    System.out.print("   ");
                }
            }

            item.print();
        }
    }
}
