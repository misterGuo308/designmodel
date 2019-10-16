package com.gy.creational.singleton;

/**
 * @author guoyou
 * @date 2019/9/12 11:02
 */
public enum  EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return  INSTANCE;
    }
}

