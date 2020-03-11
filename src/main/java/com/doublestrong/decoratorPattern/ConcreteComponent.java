package com.doublestrong.decoratorPattern;

/**
 * @author Double strong
 * @date 2020/2/12 19:25
 * 具体构件类 原味
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
