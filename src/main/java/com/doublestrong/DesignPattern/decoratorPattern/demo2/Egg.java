package com.doublestrong.DesignPattern.decoratorPattern.demo2;

/**
 * @author Double strong
 * @date 2020/6/6 10:06
 */
public class Egg extends Decorator {

    public Egg(Cake cake) {
        super(cake);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"加鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
