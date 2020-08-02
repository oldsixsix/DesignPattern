package com.doublestrong.DesignPattern.singleton.demo1;

/**
 * @author Double strong
 * @date 2020/3/5 21:11
 * 枚举单例 ，反射模式不能创建枚举单例
 * 枚举对象本身就是单例的
 * 目前就是最安全的
 */
public enum  SingletonDemo5 {
    INSTANCE;
    public SingletonDemo5 getInstance(){
        return INSTANCE;
    }
}
