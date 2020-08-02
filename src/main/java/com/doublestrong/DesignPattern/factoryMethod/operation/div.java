package com.doublestrong.DesignPattern.factoryMethod.operation;

/**
 * @author Double strong
 * @date 2020/2/29 10:40
 */
public class div extends Operation {
    @Override
    public double getResult() {
        return numA/numB;
    }
}
