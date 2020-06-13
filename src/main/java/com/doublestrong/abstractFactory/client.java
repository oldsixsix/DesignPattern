package com.doublestrong.abstractFactory;

/**
 * @author Double strong
 * @date 2020/6/10 10:12
 */
public class client {
    public static void main(String[] args) {
//        创建小米路由器，小米手机
        IFactory factory=new MiFactory();
        IPhoneProduct iPhoneProduct = factory.iPhoneProductFactory();
        IRouterProduct iRouterProduct = factory.iRouterProductFactory();
        iPhoneProduct.call();
        iRouterProduct.wifi();

//        创建华为路由器，华为手机
        IFactory huaweiFactory=new HuaweiFactory();
        IPhoneProduct iPhoneProduct1 = huaweiFactory.iPhoneProductFactory();
        IRouterProduct iRouterProduct1 = huaweiFactory.iRouterProductFactory();
        iPhoneProduct1.call();
        iRouterProduct1.wifi();
    }
}
