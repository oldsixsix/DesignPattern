package com.doublestrong.abstractFactory;

/**
 * @author Double strong
 * @date 2020/3/3 21:35
 */
public class HuaweiPhone implements IPhoneProduct {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
    
}
