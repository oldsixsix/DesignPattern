package com.doublestrong.factoryMethod.factory;

import com.doublestrong.factoryMethod.operation.Operation;
import com.doublestrong.factoryMethod.operation.sub;

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
