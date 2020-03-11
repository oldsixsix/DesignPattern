package com.doublestrong.factoryMethod.factory;

import com.doublestrong.factoryMethod.operation.Operation;
import com.doublestrong.factoryMethod.operation.add;

/**
 * @author Double strong
 * @date 2020/2/29 10:45
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new add();
    }
}
