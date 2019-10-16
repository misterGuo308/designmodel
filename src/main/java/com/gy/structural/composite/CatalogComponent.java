package com.gy.structural.composite;

/**
 * @author guoyou
 * @date 2019/9/20 10:52
 * <p>
 * 课程组件
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");

    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");

    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");

    }

    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");

    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");

    }

}
