package com.doublestrong.DesignPattern.templateMethodPattern;

/**
 * @author Double strong
 * @date 2020/2/29 10:30
 * 其抽象操作由子类实现
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void operation1() {
        System.out.println("具体类B实现方法1");
    }

    @Override
    public void operation2() {
        System.out.println("具体类B实现方法2");
    }
}
