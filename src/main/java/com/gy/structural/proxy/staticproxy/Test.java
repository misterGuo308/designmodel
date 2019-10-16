package com.gy.structural.proxy.staticproxy;

/**
 * @author guoyou
 * @date 2019/9/26 15:44
 */
public class Test {


    /**
     * 静态代理
     *
     * @param args
     *
     * 从这里我们可以看出,如果我们还想要代理一个dog的类那么
     * 我们还需要创建一个dog类的代理类.这样就非常麻烦,因此我们可以用动态代理
     */
    public static void main(String[] args) {
        CatProxy catProxy = new CatProxy(new Cat());

        catProxy.action();
        catProxy.breath();
    }
}
