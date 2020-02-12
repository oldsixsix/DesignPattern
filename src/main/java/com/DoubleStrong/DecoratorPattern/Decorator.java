package com.DoubleStrong.DecoratorPattern;

/**
 * @author Double strong
 * @date 2020/2/12 19:27
 */
public  abstract class Decorator extends AbstractComponent {
//    用抽象装饰者来包装对象，首先声明包装对象
    private AbstractComponent abstractComponent;
//    将具体包装器交给装饰者
    public Decorator(AbstractComponent abstractComponent){
        this.abstractComponent=abstractComponent;
    }
//    我们调用的是具体包装器的方法
    @Override
    public String getMsg() {
        return abstractComponent.getMsg();
    }

    @Override
    public int getPrice() {
        return abstractComponent.getPrice();
    }
}
