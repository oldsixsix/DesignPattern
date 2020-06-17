package com.doublestrong.proxyPattern.DramticProxy;

/**
 * @author Double strong
 * @date 2020/2/15 16:52
 */
public class realSub implements abstractSub {
    @Override
    public void doSomething() {
        System.out.println("真实对象的方法");
    }

//    cglib可以实现具体类的非接口实现方法
    public void func(){
        System.out.println("非接口实现方法");
    }
}
