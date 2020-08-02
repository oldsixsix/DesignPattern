package com.doublestrong.DesignPattern.iteratorPattern;

/**
 * @author Double strong
 * @date 2020/6/14 10:39
 * 电视机TV有很多平多，对电视的频道做一个迭代器，能循环到一个个频道
 * 定义抽象接口，定义迭代器中的方法
 */
public interface Iterator {
    public Object next();
    public boolean hasNext();

}
