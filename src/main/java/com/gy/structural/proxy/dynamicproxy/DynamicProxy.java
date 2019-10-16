package com.gy.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author guoyou
 * @date 2019/9/26 15:41
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;


    public DynamicProxy(Object target) {

        this.target = target;
    }

       public Object bind(){
           Class<?> targetClass = target.getClass();
           return Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
       }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理前置方法增强");
        Object arg = args[0];
        Object invoke = method.invoke(target, args);
        System.out.println("动态代理后置方法增强");
        return invoke;
    }
}
