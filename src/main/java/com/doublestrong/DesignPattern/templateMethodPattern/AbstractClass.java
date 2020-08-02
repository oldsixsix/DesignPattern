package com.doublestrong.DesignPattern.templateMethodPattern;

/**
 * @author Double strong
 * @date 2020/2/29 10:26
 * 模板抽象类
 */
public abstract class AbstractClass {
//    定义一些抽象行为，由子类实现
    public abstract void operation1();
    public abstract void operation2();

//    定义模板方法，给出算法逻辑骨架，而逻辑的由相应的抽象操作组成，其实现推迟到子类中实现
    public void TemplateMethod(){
        System.out.println("算法的逻辑骨架");
        operation1();
        operation2();

    }
}
