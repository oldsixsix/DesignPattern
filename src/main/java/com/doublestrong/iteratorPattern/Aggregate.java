package com.doublestrong.iteratorPattern;

/**
 * @author Double strong
 * @date 2020/6/14 10:43
 * 声明一个抽象聚合接口，定义创建迭代器方法
 */
public interface Aggregate {
    public Iterator createIterator();
}
