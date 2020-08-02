package com.doublestrong.DesignPattern.abstractFactory;

/**
 * @author Double strong
 * @date 2020/3/3 21:41
 */
public class MiFactory implements IFactory {
    @Override
    public  IPhoneProduct iPhoneProductFactory() {
        return new MiPhone();
    }

    @Override
    public IRouterProduct iRouterProductFactory() {
        return new MiRouter();
    }
}
