package com.doublestrong.DesignPattern.factoryMethod.factory;

import com.doublestrong.DesignPattern.factoryMethod.operation.Operation;
import com.doublestrong.DesignPattern.factoryMethod.operation.sub;

/**
 * @author Double strong
 * @date 2020/2/29 10:45
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new sub();
    }
}
