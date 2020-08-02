package com.doublestrong.DesignPattern.factoryMethod.operation;

/**
 * @author Double strong
 * @date 2020/2/29 10:38
 */
public abstract class  Operation {
    public double numA;
    public double numB;
//    定义抽象方法
    public abstract double getResult();
}
