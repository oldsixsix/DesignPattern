package com.doublestrong.DesignPattern.simpleFactory;

/**
 * @author Double strong
 * @date 2020/2/10 21:46
 */
public class mul implements Operation {
    public double getResult(double num1, double num2) throws Exception {
        return num1*num2;
    }
}
