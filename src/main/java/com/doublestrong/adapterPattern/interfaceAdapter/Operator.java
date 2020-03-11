package com.doublestrong.adapterPattern.interfaceAdapter;

/**
 * @author Double strong
 * @date 2020/3/11 10:51
 */
public class Operator extends adapter {
    @Override
    public void a0() {
        System.out.println("选择a0方法进行实现，而不用实现所有的方法");
    }
}
