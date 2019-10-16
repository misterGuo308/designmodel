package com.gy.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyou
 * @date 2019/9/12 10:42
 * 容器单例模式其中使用Hashmap非线程安全，如果改成使用HashTable确实是线程安全的，
 * 但是会影响性能，不建议使用。能不能使用ConcurrentHashMap呢？这里也不是绝对的线程安全。
 * 如果不考虑，序列化和反射攻击问题，容器单例模式还是有一定的使用场景的。如果程序中单例对象非常多，
 * 可以使用容器对所有单例对象进行统一管理。
 *
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static Map map = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance) {
        if (key != null && key.length() > 0 && instance != null) {
            if (!map.containsKey(key)) {
                map.put(key, instance);
            }
        }

    }
    public static  Object getInstance(String key){
       return map.get(key);
    }
}
