package com.gy.creational.prototype.clone;

import com.gy.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author guoyou
 * @date 2019/9/16 15:22
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Date date = new Date(0L);
        Pig pig1 = new Pig("佩奇", date);

        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1.toString());
        System.out.println(pig2.toString());

        pig1.getBirthday().setTime(1234567898722L);
        System.out.println(pig1.toString());
        System.out.println(pig2.toString());
        clonDestroySingleton();
    }

    /**
     * 克隆对单例模式的破坏
     */
    public  static  void clonDestroySingleton() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        HungrySingleton instance = HungrySingleton.getInstance();

        Class<HungrySingleton> aClass = HungrySingleton.class;
        Method clone = aClass.getDeclaredMethod("clone");
        clone.setAccessible(true);
        HungrySingleton newInstance = (HungrySingleton) clone.invoke(instance);

        System.out.println(instance);
        System.out.println(newInstance);

    }

}
