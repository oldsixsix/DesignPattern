package com.doublestrong.DesignPattern.templateMethodPattern;

/**
 * @author Double strong
 * @date 2020/6/9 8:30
 */
public class Client {
    public static void main(String[] args) {
        //这里用到多态。子类
        AbstractClass A=new ConcreteClassA();
        A.TemplateMethod();
        AbstractClass B=new ConcreteClassB();
        B.TemplateMethod();
    }
}
