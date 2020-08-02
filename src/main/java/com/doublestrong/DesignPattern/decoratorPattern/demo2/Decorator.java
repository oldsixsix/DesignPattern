package com.doublestrong.DesignPattern.decoratorPattern.demo2;

/**
 * @author Double strong
 * @date 2020/6/6 10:02
 * 抽象装饰类
 */
public class Decorator extends Cake{
    private Cake cake;

    public Decorator( Cake cake)
    {
        this.cake=cake;
    }
    @Override
    public String getMsg() {
        return cake.getMsg();
    }

    @Override
    public int getPrice() {
        return cake.getPrice();
    }
}
