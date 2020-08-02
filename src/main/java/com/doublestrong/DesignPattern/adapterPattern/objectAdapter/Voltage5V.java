package com.doublestrong.DesignPattern.adapterPattern.objectAdapter;

/**
 * @author Double strong
 * @date 2020/3/11 10:14
 * 提供一个5v的接口，具体实现交由实现类，客户端只用调用这个接口就可以了
 */
public interface Voltage5V {
    public int output5V();
}
