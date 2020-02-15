package com.DoubleStrong.ProxyPattern.StaticProxy;

/**
 * @author Double strong
 * @date 2020/2/15 16:46
 */
public class proxySubject implements abstractSubject {
//    创建真实对象的引用
    realSubject realSubject;

    public proxySubject(realSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void doSomething() {
//        通过代理模式增强该方法
        System.out.println("开始了");
        realSubject.doSomething();
        System.out.println("结束了");
    }
}
