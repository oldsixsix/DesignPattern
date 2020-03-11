package com.doublestrong.proxyPattern.StaticProxy;

/**
 * @author Double strong
 * @date 2020/2/15 16:45
 */
public class realSubject implements abstractSubject {

    @Override
    public void doSomething() {
        System.out.println("来自真实对象的方法");
    }
}
