package com.doublestrong.DesignPattern.abstractFactory;

/**
 * @author Double strong
 * @date 2020/3/3 21:37
 */
public class MiRouter implements IRouterProduct {
    @Override
    public void wifi() {
        System.out.println("小米路由器打开wifi");
    }
}
