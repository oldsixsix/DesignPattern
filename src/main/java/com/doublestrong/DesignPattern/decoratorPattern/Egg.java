package com.doublestrong.DesignPattern.decoratorPattern;

/**
 * @author Double strong
 * @date 2020/2/12 19:27
 */
public class Egg extends Decorator {
//    这里调用装饰者类的方法
    public Egg(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

//    加了一个鸡蛋
    @Override
    public String getMsg() {
        return super.getMsg()+"加一个鸡蛋";
    }
//  价格+2
    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
