package com.doublestrong.DesignPattern.factoryMethod.factory;

import com.doublestrong.DesignPattern.factoryMethod.operation.Operation;

/**
 * @author Double strong
 * @date 2020/2/29 10:42
 */
public interface IFactory {
    Operation createOperation();
}
