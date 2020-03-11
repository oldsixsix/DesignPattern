package com.doublestrong.adapterPattern.interfaceAdapter;

/**
 * @author Double strong
 * @date 2020/3/11 10:52
 */
public class Client {
    public static void main(String[] args) {
        Operator operator=new Operator();
        operator.a0();
//        选择a0方法进行实现，而不用实现所有的方法
    }
}
