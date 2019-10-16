package com.gy.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * @author guoyou
 * @date 2019/9/5 15:04
 */
public class Test {


    public static void main(String[] args) throws Exception {
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
      Thread thread = new Thread(new LazySingletonThread());
        Thread thread1 = new Thread(new LazySingletonThread());
        thread.start();
        thread1.start();
        System.out.println("end");

  /*
      序列化测试
      HungrySingleton instance = HungrySingleton.getInstance();

        ObjectOutputStream oop =new ObjectOutputStream(new FileOutputStream("file-hungry"));
        oop.writeObject(instance);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file-hungry"));
        HungrySingleton instance2 = (HungrySingleton) objectInputStream.readObject();
        System.out.println(instance);
        System.out.println(instance2);*/
      //  reflect();



    }

    /**
     * 反射测试
     *
     * 懒汉式单例模式无法防御反射攻击
     */
    public static void reflect() throws Exception {
        /*
        反射测试
        HungrySingleton instance = HungrySingleton.getInstance();
        Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
        Constructor<HungrySingleton> constructor = hungrySingletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton newInstance = constructor.newInstance();
*/
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        Class<StaticInnerClassSingleton> aClass = StaticInnerClassSingleton.class;
        Constructor<StaticInnerClassSingleton> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingleton newInstance = constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);

    }
}