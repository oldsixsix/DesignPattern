package com.doublestrong.proxyPattern.CglibProxy;

import com.doublestrong.proxyPattern.DramticProxy.abstractSub;
import com.doublestrong.proxyPattern.DramticProxy.realSub;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @author Double strong
 * @date 2020/6/17 10:11
 * 使用cglib进行动态代理，通过继承（setSuperclass）实现，具体类不需要实现特定的接口
 * 而代理类可以调用具体类的非接口方法
 */
public class Client {
    public static void main(String[] args) {
        realSub realSub = new realSub();
        MethodInterceptor methodInterceptor=new MethodInterceptorImpl();



//        创建cglib加强器
        Enhancer enhancer = new Enhancer();
//        设置被代理的类为父类，这里实现继承被代理类的所有方法，不需要共同实现接口
        enhancer.setSuperclass(realSub.getClass());
        enhancer.setCallback(methodInterceptor);
        realSub o = (realSub)enhancer.create();
        o.func();
    }
}
