package com.doublestrong.abstractFactory;

/**
 * @author Double strong
 * @date 2020/3/3 21:37
 */
public class HuaweiRouter implements IRouterProduct {
    @Override
    public void wifi() {

        System.out.println("华为路由器打开wifi");
    }
}
