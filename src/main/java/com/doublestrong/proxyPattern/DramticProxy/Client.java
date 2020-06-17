package com.doublestrong.proxyPattern.DramticProxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author Double strong
 * @date 2020/6/17 9:46
 */
public class Client {
    public static void main(String[] args) {
//        创建被代理的具体类
        realSub realSub=new realSub();
//        将被代理类对象传入自定义InvocationHandler处理器
        customizeHandler customizeHandler = new customizeHandler(realSub);
//
        abstractSub proxyInstance = (abstractSub)customizeHandler.getProxyInstance();
        proxyInstance.doSomething();
    }
}
