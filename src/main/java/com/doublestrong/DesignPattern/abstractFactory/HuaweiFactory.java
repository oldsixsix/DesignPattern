package com.doublestrong.DesignPattern.abstractFactory;

/**
 * @author Double strong
 * @date 2020/3/3 21:42
 */
public class HuaweiFactory implements IFactory {
    @Override
    public IPhoneProduct iPhoneProductFactory() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct iRouterProductFactory() {
        return new HuaweiRouter();
    }
}
