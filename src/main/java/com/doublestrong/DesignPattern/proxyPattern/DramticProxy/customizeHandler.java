package com.doublestrong.DesignPattern.proxyPattern.DramticProxy;

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
     * 利用反射获取被代理类的字节码文件，以及接口信息，以及自定义处理器
     * @return 返回被代理对象
     */
    public Proxy getProxyInstance(){
        return (Proxy)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),customizeHandler.this);

    }

    /**
     * 传入被代理对象，以及被代理对象实现的方法、参数 填入代理逻辑
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始了");
        Object invoke = method.invoke(target, args);
        System.out.println("结束了");
        return invoke;
    }
}
