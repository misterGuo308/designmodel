package com.gy.creational.singleton;

import java.io.Serializable;

/**
 * @author guoyou
 * @date 2019/9/9 15:23
 */
public class HungrySingleton implements Serializable ,Cloneable {


    private final static  HungrySingleton hungrySingleton;

    static {

        hungrySingleton =new HungrySingleton();

    }

    public static HungrySingleton getInstance(){
        return  hungrySingleton;
    }
    //饿汉式
    private HungrySingleton(){
      if(hungrySingleton!=null){
          throw new RuntimeException("单例模式禁止反射");
      }
    }
    //防止序列化与反序列化破坏单例
    public  Object readResolve(){
        return hungrySingleton;
    }

    /**
     * 单例模式防止克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return HungrySingleton.getInstance();
    }
}
