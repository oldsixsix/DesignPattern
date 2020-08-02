package com.doublestrong.DesignPattern.factoryMethod.factory;

import com.doublestrong.DesignPattern.factoryMethod.operation.Operation;
import com.doublestrong.DesignPattern.factoryMethod.operation.mul;

/**
 * @author Double strong
 * @date 2020/2/29 10:45
 */
public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new mul();
    }
}
