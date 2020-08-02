package com.doublestrong.DesignPattern.decoratorPattern;

/**
 * @author Double strong
 * @date 2020/2/12 19:25
 * 具体构件类 原味
 * 具体对象类，添加基础功能
 */
public class ConcreteComponent extends AbstractComponent {

    public ConcreteComponent() {
    }

    @Override
    public String getMsg() {
        return "原味煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
