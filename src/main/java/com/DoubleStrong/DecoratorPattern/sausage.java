package com.DoubleStrong.DecoratorPattern;

/**
 * @author Double strong
 * @date 2020/2/12 19:38
 */
public class sausage extends Decorator {
    public sausage(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"加一个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
