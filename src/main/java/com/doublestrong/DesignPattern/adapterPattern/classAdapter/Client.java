package com.doublestrong.DesignPattern.adapterPattern.classAdapter;

/**
 * @author Double strong
 * @date 2020/3/11 10:21
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone=new Phone();
//        传入该接口的实现类，即适配器类，把220v电压转换成5v进行返回
        phone.charging(new VoltageAdapter());


    }
}
