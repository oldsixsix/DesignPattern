package com.doublestrong.proxyPattern.CglibProxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Double strong
 * @date 2020/6/17 10:09
 */
public class MethodInterceptorImpl implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       getMoney();
//       执行被代理方法，传入对象和参数
        Object invoke = methodProxy.invokeSuper(o, objects);
        writeReceipt();
       return  invoke;
    }

    private void getMoney() {
        System.out.println("get money");
    }

    private void writeReceipt() {
        System.out.println("write receipt");
    }

}
