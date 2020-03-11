package com.doublestrong.proxyPattern.DramticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Double strong
 * @date 2020/2/15 16:53
 * 事务处理器实现InvocationHandler 来实现动态代理
 */
public class customizeHandler implements InvocationHandler {
    private Object target;

    /**
     *
     * @return 获取被代理类
     */
    public Object getTarget() {
        return target;
    }

    /**
     *
     * @param target 设置被代理类
     */
    public void setTarget(Object target) {
        this.target = target;
    }


    public customizeHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     *
     * @return 返回被代理对象
     */
    public Proxy getProxyInstance(){
        return (Proxy)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),customizeHandler.this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始了");
        Object invoke = method.invoke(target, args);
        System.out.println("结束了");
        return invoke;
    }
}
