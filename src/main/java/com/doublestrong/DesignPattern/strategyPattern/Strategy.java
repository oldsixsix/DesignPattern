package com.doublestrong.DesignPattern.strategyPattern;

/**
 * @author Double strong
 * @date 2020/2/11 21:17
 * 打折策略 抽象接口
 */
public interface Strategy {
    public double getRealPrice(double OriginalPrice);
}
