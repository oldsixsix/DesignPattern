package com.doublestrong.DesignPattern.proxyPattern.StaticProxy;

/**
 * @author Double strong
 * @date 2020/6/8 15:13
 */
public class Client {
    public static void main(String[] args) {
        proxySubject proxySubject = new proxySubject(new realSubject());
        proxySubject.doSomething();
    }
}
